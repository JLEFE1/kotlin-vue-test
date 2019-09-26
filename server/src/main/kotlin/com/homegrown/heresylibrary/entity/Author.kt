package com.homegrown.heresylibrary.entity

import com.fasterxml.jackson.annotation.JsonSetter
import com.homegrown.heresylibrary.exceptions.DomainValidationRuntimeException
import com.homegrown.heresylibrary.util.RestApiExposed
import javax.persistence.*

@Entity
data class Author constructor(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = -1,
                         val firstname: String = " ",
                         val lastname: String = " ") : RestApiExposed {


//    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
//    @JsonSetter("books")
//    @JoinTable(name = "book_author",
//            joinColumns = arrayOf(JoinColumn(name = "book_id", referencedColumnName = "id")),
//            inverseJoinColumns = arrayOf(JoinColumn(name = "author_id", referencedColumnName = "id")))
//    val books: MutableList<Book> = mutableListOf()) : RestApiExposed {
//
//        @ManyToMany(cascade = arrayOf(CascadeType.ALL))
//        @JsonSetter("books")
//        @JoinTable(name = "book_author",
//                joinColumns = arrayOf(JoinColumn(name = "book_id", referencedColumnName = "id")),
//                inverseJoinColumns = arrayOf(JoinColumn(name = "author_id", referencedColumnName = "id")))
//        private var _books: MutableList<Book> = mutableListOf()
//
//        val books: List<Book>
//                get() = _books
//
//        fun addBook(book: Book) {
//                //TODO: make this work like addCompetitor
//                _books.add(book)
//        }
//
//        fun removeBook(bookId: Int) {
//                //TODO: make this work like removeCompetitor
//                _books.find { it.id == bookId }
//                        ?. let { bookToBeRemoved -> _books.remove(bookToBeRemoved) }
//                        ?: throw DomainValidationRuntimeException("No book found for given id $bookId")
//        }

//        fun addBook(book: Book) {
//                //TODO: make this work like addCompetitor
//                books.add(book)
//        }
//
//        fun removeBook(bookId: Long) {
//                //TODO: make this work like removeCompetitor
//                books.find { it.id == bookId }
//                        ?. let { bookToBeRemoved -> books.remove(bookToBeRemoved) }
//                        ?: throw DomainValidationRuntimeException("No book found for given id $bookId")
//        }
}

