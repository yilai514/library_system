package com.librarysys.demo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import com.example.bean.*;
import com.librarysys.data.*;

@CrossOrigin
@RestController
public class SpringBootHelloWorld {
	@RequestMapping("/")
	public String hello(){
		return "Hey, Spring Boot 的 Hello World ! ";
	}

	@RequestMapping(method = RequestMethod.GET, value="/test")
	@ResponseBody
	public String test() {
		return "TEST";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/userdata")
	@CrossOrigin
	public ArrayList<UserData> getUserList() {
		return new getSQLiteData().getUserData();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/invdata")
	@CrossOrigin
	public ArrayList<InventoryData> getInvList() {
		return new getSQLiteData().getInvData();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/bookdata")
	@CrossOrigin
	public ArrayList<BookData> getBookList() {
		return new getSQLiteData().getBookData();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/brdata")
	@CrossOrigin
	public ArrayList<BorrowingRecordData> getBorrowRecordList() {
		return new getSQLiteData().getBorrowRecordData();
	}
}