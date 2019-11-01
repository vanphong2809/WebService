/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author MyPC
 */
public class Cinema {

    private String cinemaId;
    private City city;
    private Serializable cinemaName;

    public Cinema() {
    }

    public Cinema(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Cinema(String cinemaId, City city, Serializable cinemaName) {
        this.cinemaId = cinemaId;
        this.city = city;
        this.cinemaName = cinemaName;
    }

    public String getCinemaId() {
        return this.cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Serializable getCinemaName() {
        return this.cinemaName;
    }

    public void setCinemaName(Serializable cinemaName) {
        this.cinemaName = cinemaName;
    }

}
