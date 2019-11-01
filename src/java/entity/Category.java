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
public class Category {

    private String categoryId;
    private Serializable categoryName;
    private Set<MovieCategory> movieCategories = new HashSet<MovieCategory>(0);

    public Category() {
    }

    public Category(String categoryId) {
        this.categoryId = categoryId;
    }

    public Category(String categoryId, Serializable categoryName, Set<MovieCategory> movieCategories) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.movieCategories = movieCategories;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Serializable getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(Serializable categoryName) {
        this.categoryName = categoryName;
    }

    public Set<MovieCategory> getMovieCategories() {
        return this.movieCategories;
    }

    public void setMovieCategories(Set<MovieCategory> movieCategories) {
        this.movieCategories = movieCategories;
    }
}
