/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entity.Movie;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import util.ConnectionDB;

/**
 *
 * @author MyPC
 */
@WebService(serviceName = "MovieWS")
@Stateless()
public class MovieWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAllMovie")
    public ArrayList<Movie> getAllMovie() {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Movie> listMovie = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllMovie()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setScenario(rs.getString("Scenario"));
                m.setDirectors(rs.getString("Directors"));
                m.setDuration(rs.getInt("Duration"));
                m.setRelease(rs.getDate("Release"));
                m.setLanguage(rs.getString("Language"));
                m.setOverView(rs.getString("OverView"));
                m.setOrigin(rs.getString("Origin"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setStatus(rs.getBoolean("Status"));
                m.setImageMovie(rs.getString("ImageMovie"));
                listMovie.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMovie;
    }
}
