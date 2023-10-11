/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.database;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * 
 * @author Admin
 */
public class DAO_mySQL implements daoAll{
    protected Connection con;

    public DAO_mySQL() {
        
    }
    
    public String connectionName() {
    	return "mysql";
    }
    
    public Connection getDAO(){
        
        try {
        	String jdbcURL = "jdbc:mysql://localhost:3306/caro?useSSL=false";
            String jdbcUsername = "root";
            String jdbcPassword = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
            	con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
                return con;
            } catch(Exception e) {
            	System.out.println("Không thể kết nối với MySQL");
            }
        } catch (Exception e) {
            e.printStackTrace();    
        }
        
        return null;
    }
}