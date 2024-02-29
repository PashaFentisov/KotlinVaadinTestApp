package com.pashonokk.kotlinvaadintestapp.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var email: String,
    var password: String
) {

    constructor(name: String, email: String, password: String): this(0, name, email, password)
}