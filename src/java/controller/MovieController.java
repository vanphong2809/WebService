/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Movie;
import java.util.List;
import model.MovieModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class MovieController {

    private MovieModel movieModel;

    public MovieController() {
        movieModel = new MovieModel();
    }

    @RequestMapping(value = "/getAllMovie")
    public ModelAndView getAll() {
        ModelAndView model=new ModelAndView("index");
        List<Movie> listMovie=movieModel.getAllMovie();
        model.addObject("listMovie", listMovie);
        return model;
    }
}
