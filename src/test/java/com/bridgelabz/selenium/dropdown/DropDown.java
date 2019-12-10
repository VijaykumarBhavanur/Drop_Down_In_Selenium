package com.bridgelabz.selenium.dropdown;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author Vijaykumar Bhavanur 
 * purpose: To demonstrate drop down automation functionality in selenium
 * 
 */
public class DropDown {

	// Defining driver instance reference
	WebDriver driver;

	/**
	 * Method used to create and initialize driver instance
	 */
	@BeforeMethod
	public void setup() {

		// To set the path of the driver for the respective browser
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Documents/chromedriver");

		// Creating browser instance based on driver
		driver = new ChromeDriver();

		// To Open URL of application to be tested
		driver.get("https://narasimhadatta.info/bmtc_query.html");
	}

	/**
	 * Method to Test ldrop down automation functionality
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void dropDownTest() throws InterruptedException {

		// Creating select instance with web element name
		Select drpCountry = new Select(driver.findElement(By.name("from")));

		// Selecting from listed drop down
		drpCountry.selectByVisibleText("Whitefield Post Office");

		// Waiting for 5seconds
		Thread.sleep(5000);

	}

	/**
	 * Method to close resource such as browser after executing test methods
	 */
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
