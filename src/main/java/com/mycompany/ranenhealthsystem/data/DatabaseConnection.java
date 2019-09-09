
package com.mycompany.ranenhealthsystem.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseConnection {

Connection conn;
Statement stmt;
ResultSet res;

public DatabaseConnection(){
 
}
 
public Connection setConnection(){
try{
    System.out.println("sdsadasd");
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rhc", "root","");
 System.out.println("Connected to the database");
}catch(Exception e){
 
}
return conn;
}
 
public ResultSet getResult(String sql,Connection conn){
this.conn=conn;
try{
stmt=conn.createStatement();
res=stmt.executeQuery(sql);
}catch(Exception e){
 
}
return res;
}
}
