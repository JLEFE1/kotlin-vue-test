package com.homegrown.heresylibrary.entity

import com.fasterxml.jackson.annotation.JsonSetter
import com.homegrown.heresylibrary.exceptions.DomainValidationRuntimeException
import com.homegrown.heresylibrary.util.RestApiExposed
import javax.persistence.*

@Entity
data class Book constructor(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = -1,
                               val title: String = " ",
                               val subtitle: String = " ") : RestApiExposed {

//    data class Book constructor(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = -1,
//                                val title: String = " ",
//                                val subtitle: String = " ",
//                                @ManyToMany(mappedBy = "books")
//                                val authors: MutableList<Author> = mutableListOf()) : RestApiExposed {


//    @ManyToMany(mappedBy = "_books")
//    @JsonSetter("authors")
//    private var _authors: MutableList<Author> = mutableListOf()

//    val authors: List<Author>
//        get() = _authors

//    fun addAuthor(author: Author) {
//        //TODO: make this work like addCompetitor
//        _authors.add(author)
//    }
//
//    fun removeAuthor(authorId: Int) {
//        //TODO: make this work like removeCompetitor
//        _authors.find { it.id == authorId }
//                ?. let { authorToBeRemoved -> _authors.remove(authorToBeRemoved) }
//                ?: throw DomainValidationRuntimeException("No Challenge found on this competition for given id $authorId")
//    }

//    fun addAuthor(author: Author) {
//        //TODO: make this work like addCompetitor
//        authors.add(author)
//    }
//
//    fun removeAuthor(authorId: Long) {
//        //TODO: make this work like removeCompetitor
//        authors.find { it.id == authorId }
//                ?. let { authorToBeRemoved -> authors.remove(authorToBeRemoved) }
//                ?: throw DomainValidationRuntimeException("No Challenge found on this competition for given id $authorId")
//    }

}