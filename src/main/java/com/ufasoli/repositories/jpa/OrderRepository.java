package com.ufasoli.repositories.jpa;

import com.ufasoli.model.jpa.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 16:52
 */

public interface OrderRepository extends JpaRepository<Order, Long> {
}
