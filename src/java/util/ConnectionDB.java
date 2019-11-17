/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ConnectionDB {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=MovieTicket";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String USER = "sa";
    private static final String PASS = "12345";

    public static Connection openConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, e);
}
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void closeConnection(Connection conn, CallableStatement callableSt) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (callableSt != null) {
            try {
                callableSt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
