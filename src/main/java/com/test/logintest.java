package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sales1.loginPage;

public class logintest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		loginPage lp=new loginPage(driver);
		driver.navigate().to("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		lp.username.sendKeys("rohini@tekarch.com");
		lp.password.sendKeys("Chennai12p1");
		
		lp.loginbutton.click();
		
		driver.close();
	}

}
