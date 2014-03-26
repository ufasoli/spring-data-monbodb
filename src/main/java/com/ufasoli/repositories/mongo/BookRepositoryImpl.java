package com.ufasoli.repositories.mongo;

import com.mongodb.WriteResult;
import com.ufasoli.model.mongo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * User: Ulises Fasoli
 * Date: 26.03.2014
 * Time: 16:13
 * Project : spring-data-monbodb
 */
@Component
public class BookRepositoryImpl implements BookRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Iterable<Book> customBookFind() {

        Query query = new Query();


        Criteria orCriteria = new Criteria();
        orCriteria.orOperator(
                Criteria.where("genre").is("TECHNICAL"),
                Criteria.where("publicationYear").gt(2000)
                );
        ;
        query.addCriteria(orCriteria);

        return  mongoTemplate.find(query, Book.class);


    }

    @Override
    public WriteResult customUpdateBook() {

        Query query = new Query();
        query.addCriteria(Criteria.where("genre").is("SCIENCE-FICTION"));

        Update update = new Update();
        update.set("genre", "SCI-FI");

        return mongoTemplate.updateFirst(query, update, Book.class);

    }
}
