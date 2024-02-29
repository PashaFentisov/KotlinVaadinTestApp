package com.pashonokk.kotlinvaadintestapp.controller

import com.pashonokk.kotlinvaadintestapp.dto.UserSavingDto
import com.pashonokk.kotlinvaadintestapp.entity.User
import com.pashonokk.kotlinvaadintestapp.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserRestController(private val userService: UserService) {

    @GetMapping
    fun findAllUsers(): ResponseEntity<List<User>>{
        return ResponseEntity.ok(userService.findAllUsers())
    }

    @PostMapping
    fun createUser(@RequestBody userSavingDto: UserSavingDto): ResponseEntity<User>{
        return ResponseEntity.ok(userService.createUser(userSavingDto))
    }
}