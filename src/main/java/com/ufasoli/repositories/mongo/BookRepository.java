package com.ufasoli.repositories.mongo;

import com.ufasoli.model.mongo.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * User: Ulises Fasoli
 * Date: 26.03.2014
 * Time: 14:58
 * Project : spring-data-monbodb
 */
@RepositoryRestResource(collectionResourceRel = "books", path = "rest-books")
public interface BookRepository extends MongoRepository<Book, String>,
        BookRepositoryCustom, QueryDslPredicateExecutor<Book> {

    public Iterable<Book> findByGenre(@Param("genre") String genre);
}
