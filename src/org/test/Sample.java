package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARAVIND\\eclipse-workspace\\Robte\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtbox = driver.findElement(By.name("username"));
		txtbox.sendKeys("aravindkanna");
//		String attribute = txtbox.getAttribute(attribute);
//		System.out.println(attribute);
		
		WebElement pasbox = driver.findElement(By.name("password"));
		pasbox.sendKeys("9176379634");
		
		WebElement clic = driver.findElement(By.name("login"));
		clic.click();
		
		
	}

}
