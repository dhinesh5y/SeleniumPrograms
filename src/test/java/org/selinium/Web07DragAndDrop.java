package org.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web07DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");	
		
		Actions put = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement b = driver.findElement(By.xpath("(//li[@class='block14 ui-draggable'])"));
		WebElement b1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		put.dragAndDrop(b, b1).build().perform();
		Thread.sleep(3000);
		WebElement one = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement two = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		put.dragAndDrop(one, two).build().perform();
		Thread.sleep(3000);

		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement s1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		put.dragAndDrop(s, s1).build().perform(); 
		Thread.sleep(3000);
	
		WebElement f2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement f22 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		put.dragAndDrop(f2, f22).build().perform(); 
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
		String name = text.getText();
		System.out.println(name);	
		
	}
}