package com.ufasoli.web.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 15:55
 */
@RestController
@RequestMapping("/hello-world")
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
}
