package org.selinium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web11DropDown2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//strong[contains(text(),'Selenium Commands:' )]"));
		j.executeScript("arguments[0].scrollIntoView();",scroll);		
		Thread.sleep(3000);
		
		WebElement command = driver.findElement(By.name("selenium_commands"));
		Select s = new Select(command);
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByIndex(2);
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.deselectByIndex(3);
		s.deselectByIndex(2);
		Thread.sleep(3000);

		List<WebElement> sop = s.getAllSelectedOptions();
		for (WebElement an : sop) {
			System.out.println(an.getText());
		}
		
	//	WebElement fsop = s.getFirstSelectedOption();
	//		System.out.println(fsop.getText());
			
		System.out.println("Code Complete");
	}
}