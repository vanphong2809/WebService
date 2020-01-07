/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entity.Seat;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConnectionDB;

/**
 *
 * @author Admin
 */
public class WSBooking {
    public void getSeatSold(){
        Connection conn=null;
        CallableStatement callSt=null;
        ArrayList<Seat> list=new ArrayList<>();
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call getSeatSold()}");
            ResultSet rs=callSt.executeQuery();
            while(rs.next()){
                Seat s=new Seat();
                s.setScreenRows(rs.getInt("ScreenRows"));
                s.setSeats(rs.getInt("Seats"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
    }
}
