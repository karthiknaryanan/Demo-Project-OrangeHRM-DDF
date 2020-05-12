package com.TestCases;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlyCorrectPassword  {
	@Test
	public void loginWithOnlyCorrectPassword() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElementById("txtUsername").sendKeys("edmin");
		driver.findElementById("txtPassword").sendKeys("admin123");
		driver.findElementById("btnLogin").click();

		String actualtext = driver.findElementById("spanMessage").getText();

		Assert.assertEquals("Invalid credentials", actualtext);
		driver.close();
	}
}
