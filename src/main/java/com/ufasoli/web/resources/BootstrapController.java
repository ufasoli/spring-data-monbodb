package com.ufasoli.web.resources;

import com.ufasoli.model.mongo.Book;
import com.ufasoli.model.mongo.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 15:55
 */
@RestController
@RequestMapping("/bootstrap")
public class BootstrapController {

   @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/mongo", method = RequestMethod.GET)
    public void bootstrapMongo(){

        mongoTemplate.remove(Query.query(Criteria.where("_id").exists(true)), Book.class);


        Chapter ch1 = new Chapter();
        ch1.setNbPages(70);
        ch1.setNumber(1);
        ch1.setTitle("Chapter 1");

        Chapter ch2 = new Chapter();
        ch2.setNbPages(50);
        ch2.setNumber(2);
        ch2.setTitle("Chapter 2");



        Chapter ch3 = new Chapter();
        ch3.setNbPages(44);
        ch3.setNumber(3);
        ch3.setTitle("Chapter 3");

        Chapter ch4 = new Chapter();
        ch4.setNbPages(23);
        ch4.setNumber(4);
        ch4.setTitle("Chapter 4");


        Chapter ch5 = new Chapter();
        ch5.setNbPages(34);
        ch5.setNumber(5);
        ch5.setTitle("Chapter 5");


        Chapter ch6 = new Chapter();
        ch6.setNbPages(62);
        ch6.setNumber(6);
        ch6.setTitle("Chapter 6");


        Chapter ch7 = new Chapter();
        ch7.setNbPages(15);
        ch7.setNumber(7);
        ch7.setTitle("Chapter 7");


        Chapter ch8 = new Chapter();
        ch8.setNbPages(23);
        ch8.setNumber(8);
        ch8.setTitle("Chapter 8");

        Chapter ch9 = new Chapter();
        ch9.setNbPages(97);
        ch9.setNumber(9);
        ch9.setTitle("Chapter 9");

        Chapter ch10 = new Chapter();
        ch10.setNbPages(76);
        ch10.setNumber(1);
        ch10.setTitle("Chapter 10");

        Chapter ch11 = new Chapter();
        ch11.setNbPages(45);
        ch11.setNumber(11);
        ch11.setTitle("Chapter 11");


        Book book1 = new Book();
        book1.setGenre("FANTASY");
        book1.setIsbn("324324324432");
        book1.setPublicationYear(1996);
        book1.setShortDescription("A Game of Thrones");
        book1.setTitle("A Game of Thrones");
        book1.setChapters(Arrays.asList(ch1,ch2,ch3,ch4,ch5,ch6));


        Book book2 = new Book();
        book2.setGenre("FANTASY");
        book2.setIsbn("98732324234");
        book2.setPublicationYear(1999);
        book2.setShortDescription("A Clash of Kings");
        book2.setTitle("A Clash of Kings");
        book2.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8));





        Book book3 = new Book();
        book3.setGenre("FANTASY");
        book3.setIsbn("3242342432");
        book3.setPublicationYear(2000);
        book3.setShortDescription("A Storm of Swords");
        book3.setTitle("A Storm of Swords");
        book3.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5));





        Book book4 = new Book();
        book4.setGenre("FANTASY");
        book4.setIsbn("2342134234");
        book4.setPublicationYear(2005);
        book4.setShortDescription("A Feast for Crows");
        book4.setTitle("A Feast for Crows");
        book4.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7,ch8,ch9,ch10,ch11));





        Book book5 = new Book();
        book5.setGenre("FANTASY");
        book5.setIsbn("8372929");
        book5.setPublicationYear(2011);
        book5.setShortDescription("A Dance with Dragons");
        book5.setTitle("A Dance with Dragons");
        book5.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7,ch8,ch9,ch10,ch11));


        Book book6 = new Book();
        book6.setGenre("SCIENCE-FICTION");
        book6.setIsbn("324324234");
        book6.setPublicationYear(1950);
        book6.setShortDescription("I Robot");
        book6.setTitle("I Robot");
        book6.setChapters(Arrays.asList(ch1, ch2, ch3, ch4));


        Book book7 = new Book();
        book7.setGenre("TECHNICAL");
        book7.setIsbn("324820982432");
        book7.setPublicationYear(2007);
        book7.setShortDescription("Spring in Action 3d edition");
        book7.setTitle("Spring in Action 3d edition");
        book7.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6));



        Book book8 = new Book();
        book8.setGenre("TECHNICAL");
        book8.setIsbn("32423432432421");
        book8.setPublicationYear(2012);
        book8.setShortDescription("The Well-Grounded Java Developer");
        book8.setTitle("The Well-Grounded Java Developer");
        book8.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8));


        Book book9 = new Book();
        book9.setGenre("TECHNICAL");
        book9.setIsbn("3276589098098");
        book9.setPublicationYear(2013);
        book9.setShortDescription("Scala in Action");
        book9.setTitle("Scala in Actions");
        book9.setChapters(Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch9));

        mongoTemplate.save(book1);
        mongoTemplate.save(book2);
        mongoTemplate.save(book3);
        mongoTemplate.save(book4);
        mongoTemplate.save(book5);
        mongoTemplate.save(book6);
        mongoTemplate.save(book7);
        mongoTemplate.save(book8);
        mongoTemplate.save(book9);

    }
}
