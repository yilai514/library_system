package com.librarysys.data;

public class InventoryData {
	private String ISBN, storeTime;
	private int invID, status;// status available:1 onLoan:2 underPrepare:3 damaged:4
	
	public int getInvID() {
		return invID;
	}
	public void setInvID(int invID) {
		this.invID = invID;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public String getStoreTime() {
		return storeTime;
	}
	public void setStoreTime(String storeTime) {
		this.storeTime = storeTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
