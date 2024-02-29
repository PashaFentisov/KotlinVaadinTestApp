package com.pashonokk.kotlinvaadintestapp.service

import com.pashonokk.kotlinvaadintestapp.dto.UserSavingDto
import com.pashonokk.kotlinvaadintestapp.entity.User

interface UserService {
    fun findAllUsers(): List<User>
    fun createUser(userSavingDto: UserSavingDto): User
}