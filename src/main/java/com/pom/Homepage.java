package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	static WebDriver driver;
	public Homepage(WebDriver driver2)
	{
	    Homepage.driver=driver2;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@type='text']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) 
	{
		this.username = username;
	}

	public static void setDriver(WebDriver driver) 
	{
		Homepage.driver = driver;
	}
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	public WebElement getPassword() 
	{
		return password;
	}

	public void setPassword(WebElement password) 
	{
		this.password = password;
	}
	
	@FindBy(xpath="//*[@type='Submit']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="(//*[@class='search_combobox'])[1]")
	private WebElement location;
	public WebElement getLocation() 
	{
		return location;
	}
	
	@FindBy(xpath="(//*[@class='search_combobox'])[2]")
	private WebElement hotel;
	public WebElement getHotel()
	{
		return hotel;
	}
	
	@FindBy(xpath="(//*[@class='search_combobox'])[3]")
	private WebElement Roomtype;
	public WebElement getRoomtype() 
	{
		return Roomtype;
	}
	
	@FindBy(xpath="(//*[@class='search_combobox'])[4]")
	private WebElement noofroom;
	public WebElement getnoofroom()
	{
		return noofroom;
	}
	
	@FindBy(xpath="(//*[@class='search_combobox'])[5]")
	private WebElement adult;
	public WebElement getadult() 
	{
		return adult;
	}
	@FindBy(xpath="(//*[@class='search_combobox'])[6]")
	private WebElement children;
	public WebElement getchildren()
	{
		return children;
	}
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit;
	public WebElement getsubmit() 
	{
		return submit;
	}
	@FindBy(xpath="//*[@name='radiobutton_0']")
	private WebElement button;
	public WebElement getbutton() 
	{
		return button;
	}
	@FindBy(xpath="//*[@name='continue']")
	private WebElement conti;
	public WebElement getconti() 
	{
		return conti;
	}
	@FindBy(xpath="//*[@name='first_name']")
	private WebElement firstname;
	public WebElement getfirstname() 
	{
		return firstname;
	}
	public void setFirstname(WebElement firstname) 
	{
		this.firstname = firstname;
	}
	@FindBy(xpath="//*[@name='last_name']")
	private WebElement lastname;
	public WebElement getlastname() 
	{
		return lastname;
	}
	public void setLastname(WebElement lastname) 
	{
		this.lastname = lastname;
	}
	@FindBy(xpath="//*[@name='address']")
	private WebElement address;
	public WebElement getAddress() 
	{
		return address;
	}
	public void setAddress(WebElement address) 
	{
		this.address = address;
	}
	@FindBy(xpath="//*[@name='cc_num']")
	private WebElement cardno;
	public WebElement getCardno() 
	{
		return cardno;
	}

	public void setCardno(WebElement cardno) 
	{
		this.cardno = cardno;
	}
	@FindBy(xpath="//*[@name='cc_type']")
	private WebElement cardtype;
	public WebElement getCardtype() {
		return cardtype;
	}
	@FindBy(xpath="//*[@name='cc_exp_month']")
	private WebElement exp_month;
	public WebElement getExp_month() {
		return exp_month;
	}
	@FindBy(xpath="//*[@name='cc_exp_year']")
	private WebElement exp_year;
	public WebElement getExp_year() {
		return exp_year;
	}
	@FindBy(xpath="//*[@name='cc_cvv']")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}
	public void  setCvv(WebElement cvv) 
	{
		this.cvv=cvv;
	}
	@FindBy(xpath="//*[@name='book_now']")
	private WebElement book;
	public WebElement getBook() 
	{
		return book;
	}
	@FindBy(xpath="//*[@value='Logout']")
	private WebElement logout;
	public WebElement getLogout() 
	{
		return logout;
	}
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	public WebElement getItinerary() 
	{
		return itinerary;
	}
	@FindBy(xpath="(//*[@width='100%'])[5]//tr[2]//td[1]")
	private WebElement cancel;
	public WebElement getCancel() 
	{
		return cancel;
	}
	@FindBy(xpath="//*[@name='cancelall']")
	private WebElement cancelbutton;
	public WebElement getCancelbutton() 
	{
		return cancelbutton;
	}
	@FindBy(xpath="")
	private WebElement logagain;
	public WebElement getLogAgain() 
	{
		return logagain;
	}
}
