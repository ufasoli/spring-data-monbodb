package com.ufasoli.repositories.jpa;

import com.ufasoli.model.jpa.Customer;
import com.ufasoli.model.jpa.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 16:52
 */
@RestController
@RequestMapping(value="/orders",  produces = MediaType.APPLICATION_JSON_VALUE )
public interface OrderRepository extends JpaRepository<Order, Long> {
}
