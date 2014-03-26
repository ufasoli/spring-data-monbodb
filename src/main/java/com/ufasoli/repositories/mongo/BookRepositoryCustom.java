package com.ufasoli.repositories.mongo;

import com.mongodb.WriteResult;
import com.ufasoli.model.mongo.Book;

/**
 * User: Ulises Fasoli
 * Date: 26.03.2014
 * Time: 16:12
 * Project : spring-data-monbodb
 */
public interface BookRepositoryCustom {

    public Iterable<Book> customBookFind();

    public WriteResult customUpdateBook();
}
