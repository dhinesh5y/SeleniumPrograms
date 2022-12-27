package org.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web11DropDown1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(day);
		// select by three options - index, value, visibletext
		d.selectByIndex(2);
		Thread.sleep(1500);
		d.selectByValue("5");
		Thread.sleep(1500);
		d.selectByVisibleText("7");
		Thread.sleep(1500);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Jun");
		// Option la irukkura text get pannurathu ipdithan
		List <WebElement> monAll = m.getOptions();
		for (WebElement allMon : monAll) {
			String a = allMon.getText();
			System.out.println(a);
		}
		Thread.sleep(1500);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1991");
		// Option la irukkura text get pannurathu ipdithan
		List <WebElement> yrAll = y.getOptions();
		for (WebElement allYr : yrAll) {
			String b = allYr.getText();
			System.out.println(b);
		} 
		    System.out.println("Code Complete");	
	}
}