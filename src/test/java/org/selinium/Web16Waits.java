package org.selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web16Waits {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("Code Complete");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("9952077422");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("abcd1234");
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
		
		Robot s = new Robot();
		
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Code Complete");		
	}
}