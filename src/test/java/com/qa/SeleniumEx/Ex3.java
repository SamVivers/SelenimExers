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

public class Ex3 {

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
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers");
		WebElement wETable = driver.findElement(By.tagName("tbody"));
		WebElement wETop = wETable.findElement(By.tagName("tr"));
		WebElement wEName = wETop.findElement(By.tagName("td"));
		assertEquals("INF", wEName.getText());
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers");
		WebElement wETable2 = driver.findElement(By.tagName("tbody"));
		WebElement wETop2 = wETable2.findElement(By.tagName("tr"));
		WebElement wEName2 = wETop2.findElement(By.tagName("td"));
		assertEquals("IMB", wEName2.getText());
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}

