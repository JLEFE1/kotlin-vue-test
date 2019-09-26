package com.homegrown.heresylibrary.repository

import com.homegrown.heresylibrary.entity.Author
import com.homegrown.heresylibrary.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: JpaRepository<Author, Long> {
}