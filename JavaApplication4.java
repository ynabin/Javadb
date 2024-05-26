/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
       PreparedStatement ps = null;
        String url  = "jdbc:mysql://localhost:3306/javadb"; // table details
        String username = "root"; // MySQL credentials
        String password = "";
       // String query    = "select *from student"; // query to be run
        Class.forName("com.mysql.jdbc.Driver"); // Driver name
        Connection con =   (Connection) DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        //Statement st = con.createStatement();
        
        String sql = "insert into  student values('ram','2')";
        
     
 
            // Step 5: Execute the query
            ps = (PreparedStatement) con.prepareStatement(sql);
 
            // Step 6: Process the results
            ps.execute();
        
       // ResultSet rs = st.executeQuery(query); // Execute query
      //  rs.next();
      //  String name = rs.getString("name"); // Retrieve name from db
 
      //  System.out.println(name); // Print result on console
       // st.close(); // close statement
       
        con.close(); // close connection
        System.out.println("Connection Closed....");
        
    }
    
}
