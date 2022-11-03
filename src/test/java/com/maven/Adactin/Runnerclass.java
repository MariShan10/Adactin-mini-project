package com.maven.Adactin;

import java.io.IOException;

import com.pom.Homepage;

public class Runnerclass extends Baseclass 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		browser("chrome");
		url("https://adactinhotelapp.com/index.php");
		maximize();
		Homepage h = new Homepage(driver);
		pass(h.getUsername(),"MariShan");
		pass(h.getPassword(),"Gopikrish10");
		click(h.getLogin());
		wait("sleep",0);
		DropDown(h.getLocation(),"text","London",0);
		DropDown(h.getHotel(),"text","Hotel Sunshine",0);
		DropDown(h.getRoomtype(),"text","Deluxe",0);
		DropDown(h.getnoofroom(),"value","4",0);
		DropDown(h.getadult(),"value","2",0);
		DropDown(h.getchildren(),"value","2",0);
		click(h.getsubmit());
		action("click",null,h.getbutton());
		click(h.getsubmit());
		javascript("scroll",null);
		pass(h.getfirstname(),"Gopinath");
		pass(h.getlastname(),"M");
		pass(h.getAddress(),"123,Abc street,downtown,Newyork");
		pass(h.getCardno(),"8976543101345678");
		DropDown(h.getCardtype(), "value", "MAST", 0);
		DropDown(h.getExp_month(),"value","5", 0);
		DropDown(h.getExp_year(), "value", "2022", 0);
		pass(h.getCvv(),"678");
		click(h.getBook());
		wait("sleep",5000);
		javascript("scrolltoview",h.getItinerary());
		click(h.getItinerary());
		wait("sleep",5000);
		screenshot("maven_adactin");
		click(h.getCancel());
		click(h.getCancelbutton());
		alert("confirm",null);
		wait("sleep",7000);
		click(h.getLogout());
	}

}
