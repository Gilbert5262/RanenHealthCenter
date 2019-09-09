
package com.mycompany.ranenhealthsystem.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ConnectionManager {
    
    
    Connection con;
    
    
   
    public Connection getcon()
            
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/rhc", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    //pst = con.prepareStatement(sql);
    
}
