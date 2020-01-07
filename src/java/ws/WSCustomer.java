/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entity.Customer;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import util.ConnectionDB;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "WSCustomer")
public class WSCustomer {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insertCustomer")
    public void insertCustomer(Customer cus){
        Connection conn=null;
        CallableStatement callSt=null;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("insert into Customer(CustomerName,PhoneNumber,Email,Address,Password) values(?,?,?,?,?)");
            callSt.setString(1, cus.getCustomerName());
            callSt.setString(2, cus.getPhoneNumber());
            callSt.setString(3, cus.getEmail());
            callSt.setString(4, cus.getAddress());
            callSt.setString(5, cus.getPassword());
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
    }
    
    @WebMethod(operationName = "checkLogin")
    public int checkLogin(String gmail,String password){
        Connection conn=null;
        CallableStatement callSt=null;
        int status=0;
        try {
            conn=ConnectionDB.openConnection();
            callSt=conn.prepareCall("{call checkLogin(?,?,?)}");
            callSt.setString(1, gmail);
            callSt.setString(2, password);
            callSt.registerOutParameter(3, java.sql.Types.INTEGER);
            callSt.execute();
            status=callSt.getInt(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            ConnectionDB.closeConnection(conn, callSt);
        }
        return status;
    }
}
