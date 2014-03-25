package com.ufasoli.repositories.jpa;

import com.ufasoli.model.jpa.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 16:52
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
