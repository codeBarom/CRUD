package com.example.demo.Entities

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue

@Entity
class Book(
    @Id @GeneratedValue var id: Long,
    var isbn: String,
    var title: String
)