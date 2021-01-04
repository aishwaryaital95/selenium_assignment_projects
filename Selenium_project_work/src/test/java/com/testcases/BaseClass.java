package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public String FirstURL = "https://www.flipkart.com/";
	public String SecondURL = "https://www.amazon.in/";
	public String searchvalue = "Apple iPhone 7 (32GB) - Gold";

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak52817\\eclipse-selenium\\Selenium_project_work\\src\\main\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
