package com.ufasoli.model.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * User: Ulises Fasoli
 * Date: 27.03.2014
 * Time: 20:14
 * Project : spring-data-monbodb
 */
public class OrderLocations implements Serializable {
    private Map<Date, String> dateLocations;

    public Map<Date, String> getDateLocations() {
        return dateLocations;
    }

    public void setDateLocations(Map<Date, String> dateLocations) {
        this.dateLocations = dateLocations;
    }
}
