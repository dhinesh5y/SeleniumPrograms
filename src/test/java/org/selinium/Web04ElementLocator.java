package org.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web04ElementLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Webdriver - Interface
		// driver - Object
		// ChromeDriver - Sub Class
		
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		// driver.navigate().to("https://www.youtube.com/"); //also to be use this weblaunch
		
		WebElement phno = driver.findElement(By.className("phone-no"));
		// webElement - Interface
		// By - Abstract Class
		
		phno.sendKeys("9952077422");
		
		WebElement next = driver.findElement(By.id("login-signin"));
		
		next.click();
		
		System.out.println("Code Complete");
	}
}