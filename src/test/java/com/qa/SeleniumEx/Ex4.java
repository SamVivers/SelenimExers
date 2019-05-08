package com.qa.SeleniumEx;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4 {
	
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
			Actions action = new Actions(driver);
			String user = "BobbyBobBobson";
			String password = "password";
			
			driver.get("http://www.newtours.demoaut.com/mercuryregister.php?osCsid=ce5a17edf15658808e91126ffe65a1f1");
			WebElement field = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
			field.sendKeys("Bob");
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("Bobson").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("07202020202").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("bob@bob.bob").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("Bob's House").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("Bob's Street").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("Bob's Town").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("Bob's State").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("BO8 80B").perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys("u").sendKeys("n").sendKeys("i").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(user).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(password).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(password).perform();
			WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
			submit.click();
			
			driver.get("http://www.newtours.demoaut.com/");
			WebElement login = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
			login.sendKeys(user);
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(password).perform();
			WebElement signIn = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
			signIn.click();
			
			WebElement book = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"));
			book.sendKeys(Keys.ARROW_DOWN);
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.TAB).perform();
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			WebElement submit2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
			submit2.click();
			
			WebElement flights = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"));
			flights.click();
			
			WebElement flights2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[24]/td/input"));
			flights2.click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			
//			assertEquals();
			
		}
//		@After
//		public void tearDown() {
//			driver.quit();
//		}
}
