package com.maven.Adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass 
{
	public static WebDriver driver;
	
	public static void pass(WebElement w,String s) 
	{
		w.sendKeys(s);
	}
	public static void maximize() 
	{
		driver.manage().window().maximize();
	}
	public static void browser(String s) 
	{
		if(s.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(s.equals("edge")) 
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Gopi\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	public static void click(WebElement w) 
	{
		w.click();
	}
	public static void url(String s) 
	{
		driver.get(s);
	}
	public static void quit()
	{
		driver.quit();
	}
	public static void navigate(String s,String type) 
	{
		if(type.equals("to")) 
		{
			driver.navigate().to(s);
		}
		else if(type.equals("back")) 
		{
			driver.navigate().back();
		}
		else if(type.equals("forward")) 
		{
			driver.navigate().forward();
		}
		else if(type.equals("refresh")) 
		{
			driver.navigate().refresh();
		}
	}
	public static void clear(WebElement w) 
	{
		w.clear();
	}
	/*"*************************************  TAKESSCREENSHOT  ***********************************"*/
	public static void screenshot(String s) throws IOException 
	{
		TakesScreenshot s1 =(TakesScreenshot) driver;
		File f = s1.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\Gopi\\eclipse-workspace\\Selenium\\Screenshots\\"+s+".png");
		FileHandler.copy(f, F);
	}
	/*"*************************************  SYNCHRONIZATION  ***********************************"*/
	public static void wait(String s,int i) throws InterruptedException 
	{
		if(s.equals("sleep")) 
		{
			Thread.sleep(i);
		}
		else if(s.equals("implicit"))
		{
			driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		}
	}
	/*"*************************************  DROP DOWN  ***********************************"*/
	public static void DropDown( WebElement w,String type,String s,int i) 
	{
		Select se = new Select(w);
		if(type.equals("value")) 
		{
			se.selectByValue(s);
		}
		else if(type.equals("text")) 
		{
			se.selectByVisibleText(s);
		}
		else 
		{
			se.selectByIndex(i);
		}
	}
	/*"*************************************  ACTION CLASS  ***********************************"*/
	public static void action(String type,String s,WebElement w) 
	{
		Actions a = new Actions(driver);
		if(type.equals("click")) 
		{
			a.click(w).build().perform();
		}
		else if(type.equals("doubleclick")) 
		{
			a.doubleClick(w).build().perform();
		}
		else if(type.equals("dragdrop")) 
		{
			a.dragAndDrop(w, w).build().perform();
		}
		else if(type.equals("contextclick")) 
		{
			a.contextClick().build().perform();
		}
		else if(type.equals("moveto")) 
		{
			a.moveToElement(w);
		}
	}
	/*"*************************************  ROBOT CLASS  ***********************************"*/
	public static void robot() throws AWTException 
	{
		Robot r = new Robot();
	}
	/*"*************************************  JavascriptExecutor  **********************************"*/
	public static void javascript(String type,WebElement w) 
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		if(type.equals("scroll")) 
		{
		  j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		else if(type.equals("click")) 
		{
		  j.executeScript("arguments[0].click();",w);
		}
		else if(type.equals("scrolltoview"))
		{
		  j.executeScript("arguments[0].scrollIntoView();",w);
		}
	}
	/*"*************************************  ALERT  ***********************************"*/
	public static void alert(String type,String st) 
	{
		
		Alert a =driver.switchTo().alert(); 
		if(type.equals("simple")) 
		{
			a.accept();
		}
		else if(type.equals("confirm")) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter OK or CANCEL : ");
			String s = scan.nextLine();
			if(s.equalsIgnoreCase("OK")) 
			{
				a.accept();
			}
			else if(s.equalsIgnoreCase("CANCEL")) 
			{
				a.dismiss();
			}
		}
		else if(type.equals("prompt")) 
		{
			Scanner scan = new Scanner(System.in);
			for(int i=1;i<=2;i++) 
			{
			  System.out.print("Enter OK or CANCEL or SEND: ");
			  String s = scan.nextLine();
			  if(s.equalsIgnoreCase("OK")) 
			  {
				a.accept();
			  }
			  else if(s.equalsIgnoreCase("CANCEL")) 
			  {
				a.dismiss();
			  }
			  else if(s.equalsIgnoreCase("SEND")) 
			  {
				a.sendKeys(st);
			  }
		   }
		}
	}
}
