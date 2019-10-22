/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.expressions.impl

import org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor
import org.jetbrains.kotlin.ir.UNDEFINED_OFFSET
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol
import org.jetbrains.kotlin.ir.types.IrType
import org.jetbrains.kotlin.ir.util.parentAsClass
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor

class IrConstructorCallImpl(
    startOffset: Int,
    endOffset: Int,
    type: IrType,
    override val symbol: IrConstructorSymbol,
    typeArgumentsCount: Int,
    override val constructorTypeArgumentsCount: Int,
    valueArgumentsCount: Int,
    origin: IrStatementOrigin? = null
) :
    IrCallWithIndexedArgumentsBase(startOffset, endOffset, type, typeArgumentsCount, valueArgumentsCount, origin),
    IrConstructorCall {

    override fun <R, D> accept(visitor: IrElementVisitor<R, D>, data: D): R =
        visitor.visitConstructorCall(this, data)

    override val descriptor: ClassConstructorDescriptor get() = symbol.descriptor

    companion object {

        fun fromSymbolDescriptor(
            startOffset: Int,
            endOffset: Int,
            type: IrType,
            constructorSymbol: IrConstructorSymbol,
            origin: IrStatementOrigin? = null
        ): IrConstructorCallImpl {
            val constructorDescriptor = constructorSymbol.descriptor
            val classTypeParametersCount = constructorDescriptor.constructedClass.original.declaredTypeParameters.size
            val totalTypeParametersCount = constructorDescriptor.typeParameters.size
            val valueParametersCount = constructorDescriptor.valueParameters.size
            return IrConstructorCallImpl(
                startOffset, endOffset,
                type,
                constructorSymbol,
                totalTypeParametersCount,
                totalTypeParametersCount - classTypeParametersCount,
                valueParametersCount,
                origin
            )
        }

        fun fromSymbolOwner(
            startOffset: Int,
            endOffset: Int,
            type: IrType,
            constructorSymbol: IrConstructorSymbol,
            classTypeParametersCount: Int,
            origin: IrStatementOrigin? = null
        ): IrConstructorCallImpl {
            val constructor = constructorSymbol.owner
            val constructorTypeParametersCount = constructor.typeParameters.size
            val totalTypeParametersCount = classTypeParametersCount + constructorTypeParametersCount
            val valueParametersCount = constructor.valueParameters.size

            return IrConstructorCallImpl(
                startOffset, endOffset,
                type,
                constructorSymbol,
                totalTypeParametersCount,
                constructorTypeParametersCount,
                valueParametersCount,
                origin
            )
        }

        fun fromSymbolOwner(
            startOffset: Int,
            endOffset: Int,
            type: IrType,
            constructorSymbol: IrConstructorSymbol,
            origin: IrStatementOrigin? = null
        ): IrConstructorCallImpl {
            val constructedClass = constructorSymbol.owner.parentAsClass
            val classTypeParametersCount = constructedClass.typeParameters.size
            return fromSymbolOwner(startOffset, endOffset, type, constructorSymbol, classTypeParametersCount, origin)
        }

        fun fromSymbolOwner(type: IrType, constructorSymbol: IrConstructorSymbol, origin: IrStatementOrigin? = null) =
            fromSymbolOwner(UNDEFINED_OFFSET, UNDEFINED_OFFSET, type, constructorSymbol, constructorSymbol.owner.parentAsClass.typeParameters.size, origin)
    }
}

