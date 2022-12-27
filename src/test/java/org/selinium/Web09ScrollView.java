package org.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web09ScrollView {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://flipkart.com/");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','Samsung Mobile');", search);
		Thread.sleep(1000);
		
		Object getText = js.executeScript("return arguments[0].getAttribute('value')", search);
		System.out.println(getText);
		Thread.sleep(1000);
		
		WebElement seller = driver.findElement(By.xpath("(//span[contains(text(),'Become a Seller')])[1]"));
		js.executeScript("arguments[0].click()",seller);
		Thread.sleep(1000);
		
//		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Meta')]"));
//
//		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
//		Thread.sleep(4000);
//
//		WebElement scroll2 = driver.findElement(By.xpath("//li[contains(text(),'English')]"));
//		js.executeScript("arguments[0].scrollIntoView(false);", scroll2);
//		Thread.sleep(3000);

//		 js.executeScript("window.scrollBy(0,350)");
//		 Thread.sleep(2000);
		//
		// js.executeScript("window.scrollBy(0,250)");
		// Thread.sleep(2000);
		//
		// js.executeScript("window.scrollBy(0,-250)");
		// Thread.sleep(2000);
		//
		// js.executeScript("window.scrollBy(0,250)");
		// Thread.sleep(2000);

		System.out.println("Code Complete");
	}
}