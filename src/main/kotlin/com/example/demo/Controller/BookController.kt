package com.example.demo.Controller

import com.example.demo.Entities.Book
import com.example.demo.Repository.BookRepository
import org.springframework.web.bind.annotation.*

@RestController
class BookController(val bookRepository: BookRepository)  {

    @PostMapping("/book")
    fun addBook(@RequestBody book: Book) = bookRepository.save(book)

    @GetMapping("/book")
    fun getAllBooks() = bookRepository.findAll().toList()

    @GetMapping("/book/{title}")
    fun getBookByTitle(@PathVariable("title") title: String) = bookRepository.findBookByTitle(title)

}