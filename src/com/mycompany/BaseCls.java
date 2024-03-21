package com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCls {
	private WebDriver driver; // Private WebDriver instance
	private String baseUrl = "https://tutorialsninja.com/demo/"; // Private base URL

	// Constructor to initialize WebDriver
	public BaseCls() {
		// Assuming ChromeDriver is being used
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// Method to navigate to the base URL
	public void navigateToBaseUrl() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		element.click();
		Thread.sleep(1000);
	}

	// Method to close the WebDriver instance
	public void tearDown() {
		driver.quit();
	}
}
