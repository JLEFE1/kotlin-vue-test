package com.homegrown.heresylibrary.service

import com.homegrown.heresylibrary.controller.AuthorController
import com.homegrown.heresylibrary.controller.BookController
import com.homegrown.heresylibrary.entity.Book
import com.homegrown.heresylibrary.repository.AuthorRepository
import com.homegrown.heresylibrary.repository.BookRepository
import com.homegrown.heresylibrary.resource.AuthorResource
import com.homegrown.heresylibrary.resource.BookResource
import org.springframework.hateoas.jaxrs.JaxRsLinkBuilder.linkTo
import org.springframework.stereotype.Service

@Service
class AuthorService constructor(val authorRepository: AuthorRepository){
    fun getAuthorById(id: Long): AuthorResource {
        //TODO Check why findOne does not work
        //TODO See how to cope with this optional
        val author = authorRepository.findById(id).get()
        val authorResource = AuthorResource(author.firstname, author.lastname, author.id)
        val withSelfRel = linkTo(AuthorController::class.java).slash(author.id).withSelfRel()
        authorResource.add(withSelfRel)
        return authorResource
    }

    fun getAllAuthors(): MutableList<AuthorResource> {
        return authorRepository
                .findAll()
                .map { a -> AuthorResource(a.firstname, a.lastname, a.id) }
                .toMutableList()
    }
}