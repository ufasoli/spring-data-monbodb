package com.ufasoli.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 21.03.2014
 * Time: 16:36
 */
public class Chapter implements Serializable {

    private String title;
    private Integer number;
    private Integer nbPages;

    public Chapter(String title, Integer number, Integer nbPages) {
        this.title = title;
        this.number = number;
        this.nbPages = nbPages;
    }

    public Chapter() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNbPages() {
        return nbPages;
    }

    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }
}
