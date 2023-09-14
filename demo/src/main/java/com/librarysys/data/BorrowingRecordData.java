package com.librarysys.data;

public class BorrowingRecordData {
	private String borrowTime, returnTime;
	private int userID, invID;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getInvID() {
		return invID;
	}
	public void setInvID(int invID) {
		this.invID = invID;
	}
	public String getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	public String getReturnBorrowTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
}
