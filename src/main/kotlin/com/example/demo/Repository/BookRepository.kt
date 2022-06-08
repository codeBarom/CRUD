package com.example.demo.Repository

import com.example.demo.Entities.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Long> {

    fun findBookByTitle(title: String) : Book
}