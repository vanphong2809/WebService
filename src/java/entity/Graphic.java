/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MyPC
 */
public class Graphic {

    private String graphicId;
    private String graphicType;
    private Set<MovieGraphic> movieGraphics = new HashSet<MovieGraphic>(0);

    public Graphic() {
    }

    public Graphic(String graphicId) {
        this.graphicId = graphicId;
    }

    public Graphic(String graphicId, String graphicType, Set<MovieGraphic> movieGraphics) {
        this.graphicId = graphicId;
        this.graphicType = graphicType;
        this.movieGraphics = movieGraphics;
    }

    public String getGraphicId() {
        return this.graphicId;
    }

    public void setGraphicId(String graphicId) {
        this.graphicId = graphicId;
    }

    public String getGraphicType() {
        return this.graphicType;
    }

    public void setGraphicType(String graphicType) {
        this.graphicType = graphicType;
    }

    public Set<MovieGraphic> getMovieGraphics() {
        return this.movieGraphics;
    }

    public void setMovieGraphics(Set<MovieGraphic> movieGraphics) {
        this.movieGraphics = movieGraphics;
    }
}
