/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/lineMarker")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LineMarkersTestGenerated extends AbstractLineMarkersTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInLineMarker() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("MethodSeparators.kt")
    public void testMethodSeparators() throws Exception {
        runTest("idea/testData/codeInsight/lineMarker/MethodSeparators.kt");
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/dslMarker")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DslMarker extends AbstractLineMarkersTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDslMarker() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/dslMarker"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("markerAnnotationDeclaration.kt")
        public void testMarkerAnnotationDeclaration() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/dslMarker/markerAnnotationDeclaration.kt");
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/overrideImplement")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class OverrideImplement extends AbstractLineMarkersTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInOverrideImplement() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/overrideImplement"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("BadCodeNoExceptions.kt")
        public void testBadCodeNoExceptions() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/BadCodeNoExceptions.kt");
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/Class.kt");
        }

        @TestMetadata("ClassObjectInStaticNestedClass.kt")
        public void testClassObjectInStaticNestedClass() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/ClassObjectInStaticNestedClass.kt");
        }

        @TestMetadata("DelegatedFun.kt")
        public void testDelegatedFun() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/DelegatedFun.kt");
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/DelegatedProperty.kt");
        }

        @TestMetadata("EnumEntry.kt")
        public void testEnumEntry() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/EnumEntry.kt");
        }

        @TestMetadata("FakeOverrideForClasses.kt")
        public void testFakeOverrideForClasses() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideForClasses.kt");
        }

        @TestMetadata("FakeOverrideFun.kt")
        public void testFakeOverrideFun() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideFun.kt");
        }

        @TestMetadata("FakeOverrideFunWithMostRelevantImplementation.kt")
        public void testFakeOverrideFunWithMostRelevantImplementation() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideFunWithMostRelevantImplementation.kt");
        }

        @TestMetadata("FakeOverrideProperty.kt")
        public void testFakeOverrideProperty() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideProperty.kt");
        }

        @TestMetadata("FakeOverrideToStringInTrait.kt")
        public void testFakeOverrideToStringInTrait() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideToStringInTrait.kt");
        }

        @TestMetadata("FakeOverridesForTraitFunWithImpl.kt")
        public void testFakeOverridesForTraitFunWithImpl() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverridesForTraitFunWithImpl.kt");
        }

        @TestMetadata("NavigateToSeveralSuperElements.kt")
        public void testNavigateToSeveralSuperElements() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/NavigateToSeveralSuperElements.kt");
        }

        @TestMetadata("NoOverridingMarkerOnDefaultTraitImpl.kt")
        public void testNoOverridingMarkerOnDefaultTraitImpl() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/NoOverridingMarkerOnDefaultTraitImpl.kt");
        }

        @TestMetadata("Overloads.kt")
        public void testOverloads() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/Overloads.kt");
        }

        @TestMetadata("OverrideFunction.kt")
        public void testOverrideFunction() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideFunction.kt");
        }

        @TestMetadata("OverrideIconForOverloadMethodBug.kt")
        public void testOverrideIconForOverloadMethodBug() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideIconForOverloadMethodBug.kt");
        }

        @TestMetadata("OverrideMemberOfAbstractClass.kt")
        public void testOverrideMemberOfAbstractClass() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideMemberOfAbstractClass.kt");
        }

        @TestMetadata("OverridenTraitDeclarations.kt")
        public void testOverridenTraitDeclarations() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/OverridenTraitDeclarations.kt");
        }

        @TestMetadata("OverridingTooltipOnDefaultTraitImpl.kt")
        public void testOverridingTooltipOnDefaultTraitImpl() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/OverridingTooltipOnDefaultTraitImpl.kt");
        }

        @TestMetadata("PrimaryConstructorOpen.kt")
        public void testPrimaryConstructorOpen() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/PrimaryConstructorOpen.kt");
        }

        @TestMetadata("PrimaryConstructorOverride.kt")
        public void testPrimaryConstructorOverride() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/PrimaryConstructorOverride.kt");
        }

        @TestMetadata("PropertyOverride.kt")
        public void testPropertyOverride() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/PropertyOverride.kt");
        }

        @TestMetadata("SealedClass.kt")
        public void testSealedClass() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/SealedClass.kt");
        }

        @TestMetadata("ToStringInTrait.kt")
        public void testToStringInTrait() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/ToStringInTrait.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/overrideImplement/Trait.kt");
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/recursiveCall")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RecursiveCall extends AbstractLineMarkersTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInRecursiveCall() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/recursiveCall"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companionInvoke.kt")
        public void testCompanionInvoke() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/companionInvoke.kt");
        }

        @TestMetadata("conventionCall.kt")
        public void testConventionCall() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/conventionCall.kt");
        }

        @TestMetadata("differentImplicitReceiver.kt")
        public void testDifferentImplicitReceiver() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/differentImplicitReceiver.kt");
        }

        @TestMetadata("extension.kt")
        public void testExtension() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/extension.kt");
        }

        @TestMetadata("generic.kt")
        public void testGeneric() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/generic.kt");
        }

        @TestMetadata("inInlinedFunctionExpression.kt")
        public void testInInlinedFunctionExpression() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/inInlinedFunctionExpression.kt");
        }

        @TestMetadata("inInlinedLambda.kt")
        public void testInInlinedLambda() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/inInlinedLambda.kt");
        }

        @TestMetadata("inLambda.kt")
        public void testInLambda() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/inLambda.kt");
        }

        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/localClass.kt");
        }

        @TestMetadata("localFun.kt")
        public void testLocalFun() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/localFun.kt");
        }

        @TestMetadata("methodReference.kt")
        public void testMethodReference() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/methodReference.kt");
        }

        @TestMetadata("nested.kt")
        public void testNested() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/nested.kt");
        }

        @TestMetadata("otherQualifier.kt")
        public void testOtherQualifier() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/otherQualifier.kt");
        }

        @TestMetadata("propertyAccessors.kt")
        public void testPropertyAccessors() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/propertyAccessors.kt");
        }

        @TestMetadata("severalCallsInOneLine.kt")
        public void testSeveralCallsInOneLine() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/severalCallsInOneLine.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/simple.kt");
        }

        @TestMetadata("superQualifier.kt")
        public void testSuperQualifier() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/superQualifier.kt");
        }

        @TestMetadata("thisQualifier.kt")
        public void testThisQualifier() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/recursiveCall/thisQualifier.kt");
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/runMarkers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RunMarkers extends AbstractLineMarkersTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInRunMarkers() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/runMarkers"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("jUnitTestClassWithSubclasses.kt")
        public void testJUnitTestClassWithSubclasses() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/runMarkers/jUnitTestClassWithSubclasses.kt");
        }

        @TestMetadata("testNGTestClassWithSubclasses.kt")
        public void testTestNGTestClassWithSubclasses() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/runMarkers/testNGTestClassWithSubclasses.kt");
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/suspendCall")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SuspendCall extends AbstractLineMarkersTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSuspendCall() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/suspendCall"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("suspendCall.kt")
        public void testSuspendCall() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/suspendCall/suspendCall.kt");
        }

        @TestMetadata("suspendIteration.kt")
        public void testSuspendIteration() throws Exception {
            runTest("idea/testData/codeInsight/lineMarker/suspendCall/suspendIteration.kt");
        }
    }
}
