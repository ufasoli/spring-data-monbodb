package com.ufasoli.web.resources;

import com.ufasoli.model.jpa.Customer;
import com.ufasoli.model.jpa.Order;
import com.ufasoli.model.mongo.OrderLocations;
import com.ufasoli.repositories.jpa.CustomerRepository;
import com.ufasoli.repositories.jpa.OrderRepository;
import com.ufasoli.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 16:52
 */
@RestController
@RequestMapping(value="/customers",  produces = MediaType.APPLICATION_JSON_VALUE )
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Customer> findAll(){


        return customerRepository.findAll();  }

    @RequestMapping(method=RequestMethod.GET, value = "/{customerId}")
    public Customer find(@PathVariable("customerId")Long customerId){
        return customerRepository.findOne(customerId);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Customer create(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Customer update(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/{customerId}")
    public Message delete(@PathVariable("customerId")Long customerId, HttpServletResponse response){
        try{
            customerRepository.delete(customerId);
            return new Message("ok");
        }
        catch(Exception e){
            response.setStatus(400);
            return new Message("error : "+  e.getMessage());
        }
    }

}
