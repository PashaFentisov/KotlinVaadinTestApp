package com.pashonokk.kotlinvaadintestapp.dto

class UserSavingDto(
    val email: String,
    val name: String,
    val password: String
) {
    constructor(): this("", "", "")
}