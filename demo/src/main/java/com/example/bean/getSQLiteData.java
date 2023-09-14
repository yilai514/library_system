package com.example.bean;

import java.sql.*;
import java.util.ArrayList;
import com.librarysys.data.*;

public class getSQLiteData {
  public ArrayList<UserData> getUserData() {
		ArrayList<UserData> userList = new ArrayList<UserData>();
		UserData userTemp = new UserData();
	    Connection connect = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      connect = DriverManager.getConnection("jdbc:sqlite:LibraryDatabase.db");
	      System.out.println("Opened database successfully");
	      Statement stmt = connect.createStatement();
	      ResultSet rs = stmt.executeQuery("SELECT * FROM USER;");
	      while(rs.next()) {
	    	  userTemp.setUserID(rs.getInt("USERID"));
	    	  userTemp.setPhoneNum(rs.getString("PHONENUM"));
	    	  userTemp.setPwd(rs.getString("PWD"));
	    	  userTemp.setUserName(rs.getString("USERNAME"));
	    	  userTemp.setRegTime(rs.getString("REGTIME"));
	    	  userTemp.setLastLogTime(rs.getString("LASLOGTIME"));
	    	  userList.add(userTemp);
	      }
	      stmt.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    } finally {
	        try {
	            if (connect != null) {
	            	connect.close();
	            }
	        } catch (SQLException e) {
	            System.err.println(e);
	        }
	  	}
	    return userList;
	  }
  
  public ArrayList<InventoryData> getInvData() {
		ArrayList<InventoryData> invList = new ArrayList<InventoryData>();
		InventoryData invTemp = new InventoryData();
	    Connection connect = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      connect = DriverManager.getConnection("jdbc:sqlite:LibraryDatabase.db");
	      System.out.println("Opened database successfully");
	      Statement stmt = connect.createStatement();
	      ResultSet rs = stmt.executeQuery("SELECT * FROM INVENTORY;");
	      while(rs.next()) {
	    	  invTemp.setInvID(rs.getInt("INVID"));
	    	  invTemp.setISBN(rs.getString("ISBN"));
	    	  invTemp.setStoreTime(rs.getString("STORETIME"));
	    	  invTemp.setStatus(rs.getInt("STATUS"));
	    	  invList.add(invTemp);
	      }
	      stmt.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    } finally {
	        try {
	            if (connect != null) {
	            	connect.close();
	            }
	        } catch (SQLException e) {
	            System.err.println(e);
	        }
	  	}
	    return invList;
	  }

  public ArrayList<BookData> getBookData() {
	ArrayList<BookData> bookList = new ArrayList<BookData>();
	BookData bookTemp = new BookData();
    Connection connect = null;
    try {
      Class.forName("org.sqlite.JDBC");
      connect = DriverManager.getConnection("jdbc:sqlite:LibraryDatabase.db");
      System.out.println("Opened database successfully");
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK;");
      while(rs.next()) {
    	  bookTemp.setISBN(rs.getString("ISBN"));
    	  bookTemp.setName(rs.getString("NAME"));
    	  bookTemp.setAuthor(rs.getString("AUTHOR"));
    	  bookTemp.setIntro(rs.getString("INTRO"));
    	  bookList.add(bookTemp);
      }
      stmt.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    } finally {
        try {
            if (connect != null) {
            	connect.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
  	}
    return bookList;
  }

  public ArrayList<BorrowingRecordData> getBorrowRecordData() {
	ArrayList<BorrowingRecordData> BRList = new ArrayList<BorrowingRecordData>();
	BorrowingRecordData BRTemp = new BorrowingRecordData();
    Connection connect = null;
    try {
      Class.forName("org.sqlite.JDBC");
      connect = DriverManager.getConnection("jdbc:sqlite:LibraryDatabase.db");
      System.out.println("Opened database successfully");
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM BORROWRECORD;");
      while(rs.next()) {
    	  BRTemp.setUserID(rs.getInt("USERID"));
    	  BRTemp.setInvID(rs.getInt("INVID"));
    	  BRTemp.setBorrowTime(rs.getString("BORROWTIME"));
    	  BRTemp.setReturnTime(rs.getString("RETURNTIME"));
    	  BRList.add(BRTemp);
      }
      stmt.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    } finally {
        try {
            if (connect != null) {
            	connect.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
  	}
    return BRList;
  }

}
