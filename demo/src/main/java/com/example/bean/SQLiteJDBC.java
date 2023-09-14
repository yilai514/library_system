package com.example.bean;

import java.sql.*;

public class SQLiteJDBC {	
  public static void main( String args[] ) {
    Connection connect = null;
    try {
      Class.forName("org.sqlite.JDBC");
      connect = DriverManager.getConnection("jdbc:sqlite:LibraryDatabase.db");
      System.out.println("Opened database successfully");
      Statement stmt = connect.createStatement();      
 	  ResultSet rs = stmt.executeQuery("SELECT ISBN FROM INVENTORY");
 		
	  // loop through the result set
	  while (rs.next()) {
		System.out.println(rs.getString("ISBN"));
	  }      
      stmt.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    } finally {
        try { 
        	if (connect != null) { connect.close(); }
        } catch (SQLException e) {
            System.err.println(e);
        }
  	}
  }
}
