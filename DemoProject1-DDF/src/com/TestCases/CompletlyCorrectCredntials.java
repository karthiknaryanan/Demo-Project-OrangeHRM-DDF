package com.TestCases;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CompletlyCorrectCredntials {

	@Test
	public void loginWithCorrectCredentials() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElementById("txtUsername").sendKeys("Admin");
		driver.findElementById("txtPassword").sendKeys("admin123");
		driver.findElementById("btnLogin").click();
		String currentUrl = driver.getTitle();
		Assert.assertEquals("OrangeHRM", currentUrl);
		System.out.println("Login Success");
		driver.close();

	}

}
