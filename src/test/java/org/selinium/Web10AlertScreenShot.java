package org.selinium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web10AlertScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		a.accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(2000);
		a.sendKeys("Dhinesh");
		a.accept();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Windows\\workspace\\3.Dhinesh.Selinium\\Library\\ScreenShot1.png");
		FileUtils.copyFile(s, d);
		Thread.sleep(2000);
		
		
		String text1 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println("Check"+text1);
		System.out.println(text1);
		
		
		System.out.println("Code Complete");
	}
}



