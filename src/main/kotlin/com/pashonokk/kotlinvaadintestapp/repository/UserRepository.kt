package com.pashonokk.kotlinvaadintestapp.repository

import com.pashonokk.kotlinvaadintestapp.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>
