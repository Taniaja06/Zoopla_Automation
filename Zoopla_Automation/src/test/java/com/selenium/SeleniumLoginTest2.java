package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Many locators: id, Xpath, CSS selector, Link text
// Xpath = //tagname[@attribute='value']

public class SeleniumLoginTest2 {
	
static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		 driver.get("https://www.nike.com/");
		
		 driver.manage().window().maximize();
		 driver.quit();
	}

}
