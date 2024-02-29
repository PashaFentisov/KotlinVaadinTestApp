package com.pashonokk.kotlinvaadintestapp.service.impl

import com.pashonokk.kotlinvaadintestapp.dto.UserSavingDto
import com.pashonokk.kotlinvaadintestapp.entity.User
import com.pashonokk.kotlinvaadintestapp.repository.UserRepository
import com.pashonokk.kotlinvaadintestapp.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository): UserService {
    override fun findAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun createUser(userSavingDto: UserSavingDto): User {
        val user = User(userSavingDto.email, userSavingDto.name, userSavingDto.password)
        return userRepository.save(user)
    }
}