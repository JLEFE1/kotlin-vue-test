package com.homegrown.heresylibrary

import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.homegrown.heresylibrary.entity.Author
import com.homegrown.heresylibrary.entity.Book
import com.homegrown.heresylibrary.repository.AuthorRepository
import com.homegrown.heresylibrary.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.servlet.config.annotation.CorsRegistry
import java.math.BigDecimal
import java.util.stream.Stream
import java.util.Collections


@Configuration
@SpringBootApplication
class HeresyLibraryApplication @Autowired constructor(val bookRepository: BookRepository, val authorRepository: AuthorRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        bookRepository.deleteAll()
        authorRepository.deleteAll()

        bookRepository.save(Book(title = "Horis", subtitle ="Heresy"))
        bookRepository.save(Book(title = "Foo", subtitle = "bar"))
        bookRepository.findAll().forEach(::println)

        authorRepository.save(Author(firstname = "Joris", lastname = "Lefever"))
        authorRepository.save(Author(firstname = "An", lastname = "Scheers"))
        authorRepository.findAll().forEach(::println)
    }

    @Bean fun objectMapperBuilder(): Jackson2ObjectMapperBuilder = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule())

}

fun main(args: Array<String>) {
    runApplication<HeresyLibraryApplication>(*args)
}
