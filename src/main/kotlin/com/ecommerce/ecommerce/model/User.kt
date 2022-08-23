package com.example.ecomerce.project.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User (
    @Id
    val id: Int,
    val name: String,
    val mail: String,
    val contactno: Int,
    val gender: String,

    )