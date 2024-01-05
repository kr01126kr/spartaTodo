package com.teamsparta.todoproject.domain.user.service

import com.teamsparta.todoproject.domain.user.dto.SignUpRequest
import com.teamsparta.todoproject.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todoproject.domain.user.dto.UserResponse

interface UserService {

    fun signUp(request: SignUpRequest):UserResponse

    fun updateUserProfile(userId:Long, request: UpdateUserProfileRequest): UserResponse


}