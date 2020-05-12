package com.TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProviders {
	@DataProvider(name = "credentials")
	public Object[][] loginData() {

		Object[][] data = new Object[4][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "Admin";
		data[1][1] = "admin";
		data[2][0] = "Edmin";
		data[2][1] = "admin";
		data[3][0] = "Edmin";
		data[3][1] = "admin";
		return data;

	}

	@Test(dataProvider = "credentials")
	public void loginWithCorrectCredentials(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91701\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();
		driver.close();

	}

}
