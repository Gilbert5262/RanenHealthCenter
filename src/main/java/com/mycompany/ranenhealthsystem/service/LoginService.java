
package com.mycompany.ranenhealthsystem.service;

import com.mycompany.ranenhealthsystem.data.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginService {
    
    public boolean authenticateUser(String username, String password){        
        
    boolean authenticated = false;
            
    try{
     ConnectionManager db= new ConnectionManager();
            Connection con = db.getcon();
            
            Statement st = con.createStatement();
            
            StringBuilder sb = new StringBuilder();
             sb.append("select username, password from RHC.LOGIN where username=").append("'")
                     .append(username).append("'").append("and password=").append("'")
                     .append(password).append("'"); 
             
             
            
            ResultSet rs = st.executeQuery(sb.toString());
           
            if (rs.next())
                
            {
                String validUsername = rs.getString("USERNAME");
                String validPassword = rs.getString("PASSWORD");
                
                                    
                    if (validUsername.equals(username) && validPassword.equals(password)){
                        //out.println("login successful");
                        System.out.println("login successful"); 
                        authenticated = true;
                    }   
                        
                        con.close();
            }}catch(SQLException ex){   
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    return authenticated;
            }
    
}
