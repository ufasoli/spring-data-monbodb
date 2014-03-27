package com.ufasoli.web.resources;

import com.mongodb.WriteResult;
import com.ufasoli.model.mongo.Book;
import com.ufasoli.model.mongo.QBook;
import com.ufasoli.repositories.mongo.BookRepository;
import com.ufasoli.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * User: Ulises Fasoli
 * Date: 26.03.2014
 * Time: 15:33
 * Project : spring-data-monbodb
 */
@RestController()
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;



    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> findAll(){
           return bookRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.GET, value = "/{bookId}")
    public Book find(@PathVariable("bookId")String bookId){
        return bookRepository.findOne(bookId);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/genre/{genre}")
    public Iterable<Book> findByGenre(@PathVariable("genre") String genre){ return bookRepository.findByGenre(genre);  }

    @RequestMapping(method=RequestMethod.POST)
    public Book create(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Book update(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/{bookId}")
    public Message delete(@PathVariable("bookId")String bookId, HttpServletResponse response){
        try{
            bookRepository.delete(bookId);
            return new Message("ok");
        }
        catch(Exception e){
            response.setStatus(400);
            return new Message("error : "+  e.getMessage());
        }
    }
    @RequestMapping(value = "/custom-find", method = RequestMethod.GET)
    public Iterable<Book> findCustom(){
        return bookRepository.customBookFind();
    }

    @RequestMapping(value = "/custom-update", method = RequestMethod.GET)
    public WriteResult updateCustom(){
        return bookRepository.customUpdateBook();
    }


    @RequestMapping(value = "/find-genre-by-dsl/{genre}", method = RequestMethod.GET)
    public Iterable<Book> updateCustom(@PathVariable("genre") String genre){
        return bookRepository.findAll(QBook.book.genre.eq(genre));
    }

}
