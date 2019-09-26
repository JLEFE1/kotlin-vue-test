package com.homegrown.heresylibrary.repository

import com.homegrown.heresylibrary.entity.Book
import org.springframework.data.domain.Example
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookRepository: JpaRepository<Book, Long>