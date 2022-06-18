package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARAVIND\\eclipse-workspace\\Robte\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement enteremail = driver.findElement(By.id("email"));
		enteremail.sendKeys("aravind");
		
		WebElement enterpass = driver.findElement(By.id("pass"));
		enterpass.sendKeys("aravind");
		
//		driver.findElement(By.name("login")).click();
//		
//		driver.navigate().back();
		
		
		WebElement cli = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		cli.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		WebElement sendname = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendname.sendKeys("aravind");
		
		WebElement sendlastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		sendlastname.sendKeys("kanna");
		
		WebElement sendnumber = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		sendnumber.sendKeys("9176379634");
		
		
		WebElement newpass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpass.sendKeys("hello");
		
//		WebElement sel = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		List<WebElement> sel = driver.findElements(By.xpath("//select[@name='birthday_day']"));
		
		//sel.e
		//Select s = new Select((WebElement) sel); 
		for (WebElement alloption : sel) {
			
			System.out.println(alloption.getText());
		}
		
		WebElement slect = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(slect); 
		
	 s.selectByIndex(4);
	 
	 s.selectByVisibleText("19");
	 
	// s.deselectAll();
		

		
	}

}
