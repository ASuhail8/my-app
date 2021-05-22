package com.qa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstants {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get(generics.getDataFromPropertyFile("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
