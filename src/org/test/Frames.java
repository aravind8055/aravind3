package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARAVIND\\eclipse-workspace\\Robte\\driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	      driver.get("http://demo.guru99.com/test/delete_customer.php");
	      
	      WebElement txtsend = driver.findElement(By.xpath("//input[@name='cusid']"));
	      txtsend.sendKeys("aravind \n");
	      
	      driver.switchTo().alert().accept();
	      
	      /////////////////////////////////////////////////////////////////////////////////////////////////////
	      //////////////////////////////////////Alert handling ////////////////////////////////////////////////
	      /////////////////////////////////////////////////////////////////////////////////////////////////////
	      
	     
	      
	   
	    
	}

}
