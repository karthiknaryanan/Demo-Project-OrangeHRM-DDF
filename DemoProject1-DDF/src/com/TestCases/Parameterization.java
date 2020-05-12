package com.TestCases;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	
	@Test(priority=4)
	@Parameters({"username","password"})
	public void loginWithOnlyCorrectUserName(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElementById("txtUsername").sendKeys(uName);
		driver.findElementById("txtPassword").sendKeys(pWord);
		driver.findElementById("btnLogin").click();

		String actualtext = driver.findElementById("spanMessage").getText();

		Assert.assertEquals("Invalid credentials", actualtext);
		driver.close();
		
	}		
		@Test(priority=3)
		@Parameters({"username","password"})
		public void loginWithOnlyCorrectPassword(String uName, String pWord) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.findElementById("txtUsername").sendKeys(uName);
			driver.findElementById("txtPassword").sendKeys(pWord);
			driver.findElementById("btnLogin").click();

			String actualtext = driver.findElementById("spanMessage").getText();

			Assert.assertEquals("Invalid credentials", actualtext);
			driver.close();
	}
		@Test(priority=1)
		@Parameters({"username","password"})
		public void loginWithCorrectCredentials(String uName, String pWord) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.findElementById("txtUsername").sendKeys(uName);
			driver.findElementById("txtPassword").sendKeys(pWord);
			driver.findElementById("btnLogin").click();
			String currentUrl = driver.getTitle();
			Assert.assertEquals("OrangeHRM", currentUrl);
			System.out.println("Login Success");
			driver.close();

		}
		@Test(priority=2)
		@Parameters({"username","password"})
		public void loginWithWrongCredentials(String uName, String pWord) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.findElementById("txtUsername").sendKeys(uName);
			driver.findElementById("txtPassword").sendKeys(pWord);
			driver.findElementById("btnLogin").click();

			String actualtext = driver.findElementById("spanMessage").getText();

			Assert.assertEquals("Invalid credentials", actualtext);
			driver.close();

		}

}
