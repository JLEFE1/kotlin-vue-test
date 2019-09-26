package com.homegrown.heresylibrary.service

import com.homegrown.heresylibrary.controller.BookController
import com.homegrown.heresylibrary.entity.Book
import com.homegrown.heresylibrary.repository.AuthorRepository
import com.homegrown.heresylibrary.repository.BookRepository
import com.homegrown.heresylibrary.resource.BookResource
import org.springframework.hateoas.jaxrs.JaxRsLinkBuilder.linkTo
import org.springframework.stereotype.Service

@Service
class BookService constructor(val bookRepository: BookRepository){
    fun getBookById(id: Long): BookResource {
        //TODO Check why findOne does not work
        //TODO See how to cope with this optional
        val book = bookRepository.findById(id).get()
        val bookResource = BookResource(book.title, book.subtitle, book.id)
        val withSelfRel = linkTo(BookController::class.java).slash(book.id).withSelfRel()
        bookResource.add(withSelfRel)
        return bookResource
    }

    fun getAllBooks(): MutableList<BookResource> {
        return bookRepository.findAll().map { b -> BookResource(b.title, b.subtitle, b.id) }.toMutableList()
    }
}