package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc20Leads {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		System.out.println(driver.getTitle());
WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("rohini@tekarch.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Chennai12p1");
		WebElement button=driver.findElement(By.id("Login"));
		button.click();
 Thread.sleep(3000);
 WebElement lead=driver.findElement(By.id("Lead_Tab"));
lead.click();
 driver.close();}
}
