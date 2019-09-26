package com.homegrown.heresylibrary.controller

import com.homegrown.heresylibrary.repository.AuthorRepository
import com.homegrown.heresylibrary.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.RepositoryRestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.transaction.Transactional

@RestController
class RestAPIsController {
    @Autowired
    lateinit var bookRepo: BookRepository

    @Autowired
    lateinit var authorRepo: AuthorRepository

    @GetMapping("/clear")
    @Transactional
    fun clear(): String{
        // delete all data
        bookRepo.deleteAll()
        authorRepo.deleteAll()

        return "Done!"
    }

    @GetMapping("/books/save")
    fun save(): String {
        //prepare subjects
//        val math = Subject(1, "Mathematics")
//        val computer = Subject(2, "Compter")
//        val economics = Subject(3, "Economics")

        // attached subjects for each student
//        val jack = Student("Jack", listOf(math, computer, economics))
//        val peter = Student("Peter", listOf(computer, economics))

        // persist students to database
//        studentRepository.save(listOf(jack, peter))

        return "Done!"
    }
}