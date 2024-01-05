package com.teamsparta.todoproject.domain.user.service

import com.teamsparta.todoproject.domain.user.dto.SignUpRequest
import com.teamsparta.todoproject.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todoproject.domain.user.dto.UserResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl:UserService {


    @Transactional
    override fun signUp(request: SignUpRequest): UserResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse {
        TODO("Not yet implemented")
    }
}