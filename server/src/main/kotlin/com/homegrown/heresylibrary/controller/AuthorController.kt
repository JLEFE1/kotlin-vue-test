package com.homegrown.heresylibrary.controller

import com.homegrown.heresylibrary.resource.AuthorResource
import com.homegrown.heresylibrary.resource.BookResource
import com.homegrown.heresylibrary.service.AuthorService
import com.homegrown.heresylibrary.service.BookService
import org.springframework.hateoas.jaxrs.JaxRsLinkBuilder.linkTo
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/authors"])
class AuthorController constructor(val service: AuthorService) {

    @GetMapping(value = ["/{id}"])
    fun getBookById(@PathVariable id: Long): HttpEntity<AuthorResource> {
        val authorResource = service.getAuthorById(id)
        return ResponseEntity<AuthorResource>(authorResource, HttpStatus.OK)
    }

    @GetMapping()
    fun getAllOrders(): ResponseEntity<List<AuthorResource>> {
        val authorResources = service.getAllAuthors()
        for (author in authorResources) {
            val withSelfRel = linkTo(AuthorResource::class.java).slash(author.id).withSelfRel()
            author.add(withSelfRel)
        }
        return ResponseEntity(authorResources, HttpStatus.OK)
    }

}