
package travel.management.system;

import java.sql.*;

public class Conn {
    //5 STEPS IN JAVA DATABASE CONNECTIVITY(JDBC)
    //S1 REGISTERING THE DRIVER
    //S2 - CREATING CONNECTION STRING
    //s3 CREATING THE STATEMENT
    //S4 EXECUTING MYSQL QUERIES
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "Varsha@2412");
            s = c.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
