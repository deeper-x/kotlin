/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pullUp

import com.intellij.refactoring.memberPullUp.PullUpData

interface PullUpDataEx : PullUpData {
    val memberInfoMember: MemberInfoMapper
}