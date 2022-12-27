package org.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web01LaunchChrome {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\workspace\\3.Dhinesh.Selinium\\Library\\chromedrivernew.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Webdriver - Interface
		// driver - Object
		// ChromeDriver - Sub Class
		
		driver.get("https://www.youtube.com/");	
		
		System.out.println("Code Complete");
	}
}