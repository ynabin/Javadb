/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;



import java.sql.SQLException;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
      String url  = "jdbc:mysql://localhost:3306/studentrecord"; // table details
        String username = "root"; // MySQL credentials
        String password = "";
        String query    = "select *from techanicalstudent"; // query to be run
        Class.forName("com.mysql.jdbc.Driver"); // Driver name
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = (Statement) con.createStatement();
        ResultSet rs = st.executeQuery(query); // Execute query
        rs.next();
        String name = rs.getString("roll"); // Retrieve name from db
 
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
    
}
