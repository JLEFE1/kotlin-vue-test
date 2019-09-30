package com.homegrown.heresylibrary.controller

import com.homegrown.heresylibrary.resource.BookResource
import com.homegrown.heresylibrary.service.BookService
import org.springframework.hateoas.jaxrs.JaxRsLinkBuilder.linkTo
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:8080"])
@RequestMapping(value = ["/books"])
class BookController constructor(val service: BookService) {

    @GetMapping(value = ["/{id}"])
    fun getBookById(@PathVariable id: Long): HttpEntity<BookResource> {
        val orderResource = service.getBookById(id)
        return ResponseEntity<BookResource>(orderResource, HttpStatus.OK)
    }

    @GetMapping()
    fun getAllOrders(): ResponseEntity<List<BookResource>> {
        val bookResources = service.getAllBooks()
        for (book in bookResources) {
            val withSelfRel = linkTo(BookResource::class.java).slash(book.id).withSelfRel()
            book.add(withSelfRel)
        }
        return ResponseEntity(bookResources, HttpStatus.OK)
    }

}