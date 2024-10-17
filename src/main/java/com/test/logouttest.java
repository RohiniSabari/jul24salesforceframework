package com.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sales1.logoutpage;



public class logouttest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		logoutpage lp=new logoutpage(driver);
		driver.navigate().to("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		lp.username.sendKeys("rohini@tekarch.com");
		lp.password.sendKeys("Chennai12p1");
		
		lp.loginbutton.click();
		
		lp.usermenu.click();
		
		lp.logoutbutton.click();
		driver.close();

	}

}
