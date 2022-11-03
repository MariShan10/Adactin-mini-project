package com.maven.Adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("MariShan");
		driver.findElement(By.id("password")).sendKeys("Gopikrish10");
		driver.findElement(By.id("login")).click();
		
		Select location= new Select(driver.findElement(By.id("location")));
		location.selectByVisibleText("London");
		Select hotels= new Select(driver.findElement(By.id("hotels")));
		hotels.selectByVisibleText("Hotel Sunshine");
		Select roomtype= new Select(driver.findElement(By.id("room_type")));
		roomtype.selectByVisibleText("Deluxe");
		Select rooms= new Select(driver.findElement(By.id("room_nos")));
		rooms.selectByValue("4");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','1/10/2022');",driver.findElement(By.name("datepick_in")));
		j.executeScript("arguments[0].setAttribute('value','4/10/2022');",driver.findElement(By.name("datepick_out")));
		Select adult= new Select(driver.findElement(By.id("adult_room")));
		adult.selectByValue("2");
		Select child= new Select(driver.findElement(By.id("child_room")));
		child.selectByValue("2");
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		j.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		driver.findElement(By.id("first_name")).sendKeys("Mari");
		driver.findElement(By.id("last_name")).sendKeys("Shan");
		driver.findElement(By.id("address")).sendKeys("123,Abc street,downtown,Newyork");
		driver.findElement(By.id("cc_num")).sendKeys("8976543101345678");
		Select card= new Select(driver.findElement(By.id("cc_type")));
		card.selectByValue("MAST");
		Select exp= new Select(driver.findElement(By.id("cc_exp_month")));
		exp.selectByValue("5");
		Select yr= new Select(driver.findElement(By.id("cc_exp_year")));
		yr.selectByValue("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("456");
		driver.findElement(By.id("book_now")).click();
		j.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		driver.findElement(By.id("my_itinerary")).click();
		WebElement order = driver.findElement(By.xpath("(//*[@width='100%'])[5]//tr[2]//td[1]"));
		order.click();
		TakesScreenshot t = (TakesScreenshot)driver;
		File f =t.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\Gopi\\eclipse-workspace\\Selenium\\Screenshots\\project2.png");
		FileHandler.copy(f, F);
		driver.findElement(By.xpath("//*[@value='Cancel Selected']")).click();
		Alert a =driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		driver.findElement(By.name("logout")).click();
		driver.findElement(By.xpath("//*[contains(text(),'login again')]")).click();
	}

}
