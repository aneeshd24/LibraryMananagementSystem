
package librarymanagementsystem;


import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

public class conn
{
    private static Connection connection=null;
    private conn(){}
    public static Connection getConnection()
    {
        if(connection==null)
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem","root","root");  
            } catch (Exception ex) {
                System.out.println("Error in Connection ! !");
            }
        }
       return connection;
    }
}  
