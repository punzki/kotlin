/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.quickfix.fixes

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.idea.fir.api.applicator.HLApplicatorInput
import org.jetbrains.kotlin.idea.fir.api.applicator.applicatorByQuickFix
import org.jetbrains.kotlin.idea.fir.api.fixes.diagnosticFixFactory
import org.jetbrains.kotlin.idea.fir.api.fixes.withInput
import org.jetbrains.kotlin.idea.frontend.api.diagnostics.KtDiagnosticWithPsi
import org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix
import org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression

object ReplaceCallFixFactory {
    val applicator = applicatorByQuickFix<PsiElement, Input, ReplaceCallFix> { psi, input ->
        ReplaceWithSafeCallFix(psi as KtDotQualifiedExpression, input.notNullNeeded)
    }

    class Input(val notNullNeeded: Boolean) : HLApplicatorInput

    fun <DIAGNOSTIC_PSI : PsiElement, DIAGNOSTIC : KtDiagnosticWithPsi<DIAGNOSTIC_PSI>> createFactory() =
        diagnosticFixFactory<DIAGNOSTIC_PSI, DIAGNOSTIC, DIAGNOSTIC_PSI, Input>(applicator) { diagnostic ->
            // TODO: Analyze to determine if implicit receiver and should have not null type. See ReplaceWithSafeCallFixFactory in FE1.0.
            listOf(diagnostic.psi withInput Input(false))
        }
}