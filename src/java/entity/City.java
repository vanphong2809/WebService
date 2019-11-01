/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class City {

    private String cityId;
    private Serializable cityName;
    private Set<Cinema> cinemas = new HashSet<Cinema>(0);

    public City() {
    }

    public City(String cityId) {
        this.cityId = cityId;
    }

    public City(String cityId, Serializable cityName, Set<Cinema> cinemas) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cinemas = cinemas;
    }

    public String getCityId() {
        return this.cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Serializable getCityName() {
        return this.cityName;
    }

    public void setCityName(Serializable cityName) {
        this.cityName = cityName;
    }

    public Set<Cinema> getCinemas() {
        return this.cinemas;
    }

    public void setCinemas(Set<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

}
