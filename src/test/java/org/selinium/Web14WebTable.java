package org.selinium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web14WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);

		WebElement tbody = driver.findElement(By.xpath("(//tbody)[2]"));
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));

		// zero th column la irukkura company name list itrate pannanum
		for (int i = 0; i < trows.size(); i++) {
			WebElement row = trows.get(i);

			List<WebElement> tdata = row.findElements(By.tagName("td"));
			WebElement data = tdata.get(0);
			String s = data.getText();
			// System.out.println(s);

			if (s.contains("ICICI")) {
				System.out.println("Ok " + s);
			} else {
				System.out.println("Not Ok " + s);
			}
		} // Example Workout xpath - (//tbody)[2]/tr[1]/td[3]

		System.out.println("Code Complete");
	}
}