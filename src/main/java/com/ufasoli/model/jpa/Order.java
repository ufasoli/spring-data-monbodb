package com.ufasoli.model.jpa;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ufasoli.model.mongo.OrderLocations;
import org.springframework.data.mongodb.crossstore.RelatedDocument;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 16:46
 */
@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;

    private float total;

    @ManyToOne
    @JsonBackReference
    private Customer customer;


    @RelatedDocument
    private OrderLocations orderLocations;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderLocations getOrderLocations() {
        return orderLocations;
    }

    public void setOrderLocations(OrderLocations orderLocations) {
        this.orderLocations = orderLocations;
    }
}
