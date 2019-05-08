package com.qa.SeleniumEx;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
	    		"C:\\Users\\Admin\\Desktop\\chromedriver_win32/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();

	}
	@Test
	public void test1() {
		driver.get("http://automationpractice.com/index.php");
		WebElement wESearch = driver.findElement(By.id("search_query_top"));
		wESearch.sendKeys("Dress");
		wESearch.sendKeys(Keys.ENTER);
		WebElement wEResult = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5"));
		assertEquals("Printed Summer Dress", wEResult.getText());
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
