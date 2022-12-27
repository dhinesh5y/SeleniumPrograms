package org.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web06MouseAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		
		Actions a = new Actions(driver);
		
		driver.manage().window().maximize();  // window maximize
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		a.click().build().perform();  // click
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("tablemagic");
		
		a.doubleClick(search).build().perform(); // double click
		
		WebElement cli = driver.findElement(By.xpath("(//div[@class='xtXmba'])[9]"));
		
		a.moveToElement(cli).build().perform(); // cursor movement
		Thread.sleep(2000);
		
		WebElement right = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
		
		a.contextClick(right).build().perform(); // right click
		Thread.sleep(2000);
		
		System.out.println("Code Complete");
		
	//	driver.quit();
	}
}
