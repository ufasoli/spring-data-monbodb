package com.ufasoli.web.resources;

import com.ufasoli.model.jpa.Customer;
import com.ufasoli.model.jpa.Order;
import com.ufasoli.model.mongo.OrderLocations;
import com.ufasoli.repositories.jpa.CustomerRepository;
import com.ufasoli.repositories.jpa.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

/**
 * User: Ulises Fasoli
 * Date: 27.03.2014
 * Time: 22:24
 * Project : spring-data-monbodb
 */
@RestController
@RequestMapping(value="/orders",  produces = MediaType.APPLICATION_JSON_VALUE )

public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Order> crossStoreOrders(){
        OrderLocations ol  = new OrderLocations();
        HashMap<Date,String> dateLocations = new HashMap<>();
        dateLocations.put(new Date(), "NYC");
        ol.setDateLocations(dateLocations);

        Customer c = customerRepository.findOne(1L);

        Order order = new Order();
        order.setTotal(200);
        order.setOrderLocations(ol);
        order.setCustomer(c);



        orderRepository.save(order);

        return orderRepository.findAll();
    }

}
