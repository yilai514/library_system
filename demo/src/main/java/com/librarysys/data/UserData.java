package com.librarysys.data;

public class UserData {
	private String phoneNum, pwd, username, regTime, lastLogTime;
	private int userID;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getLastLogTime() {
		return lastLogTime;
	}
	public void setLastLogTime(String lastLogTime) {
		this.lastLogTime = lastLogTime;
	}	
}
