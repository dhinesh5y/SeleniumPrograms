package org.selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web12WidowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		Thread.sleep(1500);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Samsung Galaxy F12");
		
		WebElement cli = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		cli.click();
		Thread.sleep(1500);
		WebElement cli1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		cli1.click();
		Thread.sleep(1500);
		
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String all : child) {
			if (!parent.equals(child)){
				driver.switchTo().window(all);
			}
		}
		WebElement text = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		System.out.println(text.getText());
		Thread.sleep(1500);
		
		driver.switchTo().window(parent);
		WebElement text1 = driver.findElement(By.xpath("(//a[contains(text(),'Mobiles')])[1]"));
		System.out.println(text1.getText());		
		
		System.out.println("Code Complete");
	}
}