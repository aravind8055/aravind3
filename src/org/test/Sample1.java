package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ARAVIND\\eclipse-workspace\\Robte\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.edureka.co/selenium-certification-training");
	      
	      WebElement sel = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
	      
	      Actions a = new Actions(driver);
	      
	      a.contextClick(sel).perform();
	      
	      Robot r = new Robot();
	      

	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      
	      Thread.sleep(4000);
	      
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      
	      Thread.sleep(4000);
	      
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      
	      Thread.sleep(4000);
	      
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      
	      Thread.sleep(4000);
	      
	      driver.quit();
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      //	      r.keyPress(KeyEvent.VK_DOWN);
//	      Thread.sleep(4000);
//	      r.keyPress(KeyEvent.VK_TAB);
//	      Thread.sleep(4000);
//	      System.out.println("a");
//	      r.keyPress(KeyEvent.VK_TAB);
//	      Thread.sleep(4000);
//	      System.out.println("b");
//	      r.keyPress(KeyEvent.VK_TAB);
//	      Thread.sleep(4000);
//	      System.out.println("c");
//	      r.mouseMove(30, 100);
//	      System.out.println("d");
//	      Thread.sleep(4000);
//	      driver.quit();
	      
	      
	      
	      
	      
	      
	}

}
