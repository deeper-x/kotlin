/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pullUp

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMember
import com.intellij.refactoring.classMembers.MemberInfoBase
import org.jetbrains.kotlin.asJava.unwrapped

class MemberInfoMapper(memberInfos: Iterable<MemberInfoBase<*>>) {
    private val psi2Info = HashMap<PsiElement, MemberInfoBase<*>>()

    init {
        for (memberInfo in memberInfos) {
            val member = memberInfo.member.unwrapped ?: continue
            psi2Info[member] = memberInfo
        }
    }

    fun getMemberInfo(element: PsiElement) = psi2Info[element.unwrapped]
}