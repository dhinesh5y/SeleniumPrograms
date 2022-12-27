package org.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web05Xpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("dhinesh5@");
		Thread.sleep(5000);
		username.clear();
		username.sendKeys("dhinesh5@yahoo.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("abcd1234");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();

		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		search.sendKeys("Samsung galaxy f13");

		Thread.sleep(3000);
		WebElement cli = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		Thread.sleep(4000);
		cli.click();

		Thread.sleep(4000);
		WebElement mob = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		Thread.sleep(3000);
		mob.click();

		Thread.sleep(6000);
		WebElement mobtext = driver.findElement(By.xpath("(//*[contains(text(),'Waterfall')])[1]"));
		Thread.sleep(9000);
		String mobname = mobtext.getText();
		System.out.println(mobname);

		System.out.println("Code Complete");
	}
}