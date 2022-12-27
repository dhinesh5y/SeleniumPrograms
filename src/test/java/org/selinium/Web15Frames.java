package org.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web15Frames {    // Both Codes in this -- Frame Itration & Switch to Frame 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abcd@gmail.com");
		
		List<WebElement> total = driver.findElements(By.xpath("//iframe"));
		System.out.println(total.size());
		
		for (int i = 0; i < total.size(); i++){
			try {
				driver.switchTo().frame(i);
				driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
				System.out.println(i);
			}
			catch (Exception e) {
				System.out.println("Not Found "+i);
//				System.out.println(e);
				driver.switchTo().parentFrame();
			}
		}
		
		driver.switchTo().frame("a077aa5e");  // id or name la element kudukanum
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		System.out.println("Code Complete");
	}
}