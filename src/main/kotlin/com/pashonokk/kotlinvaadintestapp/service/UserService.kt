package com.pashonokk.kotlinvaadintestapp.service

import com.pashonokk.kotlinvaadintestapp.entity.User

interface UserService {
    fun findAllUsers(): List<User>
}