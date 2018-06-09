/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pullUp

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.refactoring.memberPullUp.PullUpProcessor
import com.intellij.refactoring.util.DocCommentPolicy
import com.intellij.refactoring.util.classMembers.MemberInfo
import org.jetbrains.kotlin.asJava.unwrapped

class PullUpProcessorWrapper(
    sourceClass: PsiClass,
    targetSuperClass: PsiClass,
    membersToMove: Array<MemberInfo>,
    javaDocPolicy: DocCommentPolicy<*>
) : PullUpProcessor(sourceClass, targetSuperClass, membersToMove, javaDocPolicy), PullUpDataEx {
    override val memberInfoMember = MemberInfoMapper(membersToMove.toList())
}