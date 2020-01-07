/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entity.Category;
import entity.City;
import entity.Dayss;
import entity.Movie;
import entity.MovieCategory;
import entity.Ticket;
import entity.Ticketing;
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
import java.util.logging.Level;
import java.util.logging.Logger;

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
                m.setMoviePrice(rs.getInt("MoviePrice"));
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
    @WebMethod(operationName = "insertMovie")
    public boolean insertProduct(Movie m) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("insert into Movie(MovieName,Scenario,Directors,Duration,Language,OverView,Origin,VideoTrailer,ImageMovie,MoviePrice) values(?,?,?,?,?,?,?,?,?,?)");
            callSt.setString(1, m.getMovieName());
            callSt.setString(2, m.getScenario());
            callSt.setString(3, m.getDirectors());
            callSt.setInt(4, m.getDuration());
            callSt.setString(5, m.getLanguage());
            callSt.setString(6, m.getOverView());
            callSt.setString(7, m.getOrigin());
            callSt.setString(8, m.getVideoTrailer());
            callSt.setString(9, m.getImageMovie());
            callSt.setInt(10, m.getMoviePrice());
            callSt.executeUpdate();
            result=true;
        } catch (Exception e) {
            Logger.getLogger(WSMovie.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
    @WebMethod(operationName = "updateMovie")
    public boolean updateProduct(Movie m) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateMovie(?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, m.getMovieId());
            callSt.setString(2, m.getMovieName());
            callSt.setString(3, m.getScenario());
            callSt.setString(4, m.getDirectors());
            callSt.setInt(5, m.getDuration());
            callSt.setString(6, m.getLanguage());
            callSt.setString(7, m.getOverView());
            callSt.setString(8, m.getOrigin());
            callSt.setString(9, m.getVideoTrailer());
            callSt.setString(10, m.getImageMovie());
            callSt.setInt(11, m.getMoviePrice());
            callSt.executeUpdate();
            result=true;
        } catch (Exception e) {
            Logger.getLogger(WSMovie.class.getName()).log(Level.SEVERE,null, e);
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
    //Lấy ra danh sách thể loại phim
    @WebMethod(operationName = "getCategory")
    public ArrayList<Category> getCategory() {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Category> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getCategory()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCategoryId(rs.getString("CategoryID"));
                c.setCategoryName(rs.getString("CategoryName"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // lay ra danh sach phim theo the loai
    @WebMethod(operationName = "getMovieByCategory")
    public ArrayList<Movie> getMovieByCategory(String categoryId) {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Movie> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getMovieByCategory(?)}");
            callSt.setString(1, categoryId);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setImageMovie(rs.getString("ImageMovie"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setOrigin(rs.getString("Origin"));
                m.setCategoryName(rs.getString("CategoryName"));
                m.setMoviePrice(rs.getInt("MoviePrice"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @WebMethod(operationName = "getMovieById")
    public Movie getMovieById(String movieId) {
        Connection conn = null;
        CallableStatement callSt = null;
        Movie m = new Movie();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getMovieById(?)}");
            callSt.setString(1, movieId);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setImageMovie(rs.getString("ImageMovie"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setRelease(rs.getDate("Release"));
                m.setDuration(rs.getInt("Duration"));
                m.setOrigin(rs.getString("Origin"));
                m.setOverView(rs.getString("OverView"));
                m.setMoviePrice(rs.getInt("MoviePrice"));
                m.setCategoryName(rs.getString("CategoryName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }

    @WebMethod(operationName = "searchMovie")
    public ArrayList<Movie> SearchMovie(String movieName) {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Movie> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call SearchMovie(?)}");
            callSt.setString(1, movieName);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setMovieId(rs.getString("MovieID"));
                m.setMovieName(rs.getString("MovieName"));
                m.setImageMovie(rs.getString("ImageMovie"));
                m.setVideoTrailer(rs.getString("VideoTrailer"));
                m.setOrigin(rs.getString("Origin"));
                m.setCategoryName(rs.getString("CategoryName"));
                m.setMoviePrice(rs.getInt("MoviePrice"));
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @WebMethod(operationName = "getDayByMovie")
    public ArrayList<Dayss> getDayByMovie(String movieID) {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Dayss> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getDayByMovie(?)}");
            callSt.setString(1, movieID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Dayss d = new Dayss();
                d.setDayId(rs.getString("DayID"));
                d.setDayss(rs.getDate("Dayss"));
                d.formatDate(d.getDayss());
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @WebMethod(operationName = "getCityByDay")
    public ArrayList<City> getCityByDay(String movieID, String dayID) {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<City> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getCityByMovie(?,?)}");
            callSt.setString(1, movieID);
            callSt.setString(2, dayID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                City c = new City();
                c.setCityId(rs.getString("CityID"));
                c.setCityName(rs.getString("CityName"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @WebMethod(operationName = "getTicketing")
    public ArrayList<Ticketing> getTicketing(String movieID, String dayID, String cityID) {
        Connection conn = null;
        CallableStatement callSt = null;
        ArrayList<Ticketing> list = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getInforByMovie(?,?,?)}");
            callSt.setString(1, movieID);
            callSt.setString(2, dayID);
            callSt.setString(3, cityID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Ticketing t = new Ticketing();
                t.setCinemaName(rs.getString("CinemaName"));
                t.setHour(rs.getString("Hourss"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
