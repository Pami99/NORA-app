/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:xxxx/policeuser?useSSL=false","root","xxxx"); //add a avilable port number and pwd
            System.out.println("Database Connected.");
        }
    
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Couldn't connect to the databse!");
        }
        return conn;
        
    }
}
