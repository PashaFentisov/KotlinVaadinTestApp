package com.pashonokk.kotlinvaadintestapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class DatabaseCredentials {

    @Value("\${spring.datasource.username}")
    lateinit var username: String

    @Value("\${spring.datasource.password}")
    lateinit var password: String

    @Value("\${spring.datasource.url}")
    lateinit var url: String

    fun printCredentials() {
        println("Username: $username, Password: $password, URL: $url")
    }
}