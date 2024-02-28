package com.pashonokk.kotlinvaadintestapp.controller

import com.pashonokk.kotlinvaadintestapp.entity.User
import com.pashonokk.kotlinvaadintestapp.service.UserService
import org.atmosphere.config.service.Get
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserRestController(private val userService: UserService) {

    @GetMapping
    fun findAllUsers(): ResponseEntity<List<User>>{
        return ResponseEntity.ok(userService.findAllUsers())
    }
}