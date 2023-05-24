
package com.tech.blog.helper;
import java.sql.*;
public class ConnectionProvider
{
    private static Connection con;
    public static Connection getConnection()//this is a method which return connection con to Connection 
    {
        try
        {
            if(con==null)
            {
                //load driver class here .
            Class.forName("com.mysql.jdbc.Driver");
                //Create a connection.
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","root");
                
            }
        }
          catch(Exception e)

          {
           e.printStackTrace();
           
        }
        
     return con;//iske upr jo bhi hum body m likhenge vo upr Connection ko return ho jaayega.   
    }
}

