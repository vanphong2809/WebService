/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entity.Category;
import entity.Movie;
import entity.MovieCategory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import util.ConnectionDB;
import java.util.Date;
/**
 *
 * @author Admin
 */
@WebService(serviceName = "WSMovie")
public class WSMovie {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAllMovie")
    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> list = new ArrayList<>();
        Connection conn = null;
        CallableStatement callSt = null;
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
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @WebMethod(operationName = "NewRelease")
    public ArrayList<Movie> getLaTestMovie() {
        ArrayList<Movie> list = new ArrayList<>();
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getLatestMovie()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setImageMovie(rs.getString("ImageMovie"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setRelease(rs.getDate("Release"));
                m.setMoviePrice(rs.getInt("MoviePrice"));
                m.setOrigin(rs.getString("Origin"));
                m.setCategoryName(rs.getString("CategoryName"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @WebMethod(operationName = "ComingSoon")
    public ArrayList<Movie> getComingSoon() {
        ArrayList<Movie> list = new ArrayList<>();
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getComingSoon()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setImageMovie(rs.getString("ImageMovie"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setRelease(rs.getDate("Release"));
                m.setOverView(rs.getString("OverView"));
                m.setDirectors(rs.getString("Directors"));
                m.setScenario(rs.getString("Scenario"));
                m.setOrigin(rs.getString("Origin"));
                m.setCategoryName(rs.getString("CategoryName"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
