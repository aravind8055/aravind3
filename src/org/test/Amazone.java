package org.test;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Amazone {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ARAVIND\\\\eclipse-workspace\\\\Robte\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		
     	
     	WebElement serchbox = driver.findElement(By.id("twotabsearchtextbox"));
		serchbox.sendKeys("iphone");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String eachwindow : allwindow) {
			if(!eachwindow.equals(allwindow)) {
				driver.switchTo().window(eachwindow);
			}
				
		}
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(4000);
		
	    TakesScreenshot screen = (TakesScreenshot) driver;
	    
	    File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
	    
	    File f = new File("C:\\Users\\ARAVIND\\OneDrive\\Desktop\\screen\\fb.jpeg");
	    
	    FileHandler.copy(screenshotAs, f);
	    
	    
	    
	    
	   
	    
	   // driver.quit();
	    
	    }
	



}
