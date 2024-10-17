package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc03Rememberme {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("rohini@tekarch.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Chennai12p1");

		WebElement remember=driver.findElement(By.xpath("//*[@id='rememberUn']"));
		remember.click();
		WebElement button=driver.findElement(By.id("Login"));
		button.click();
	
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("userNavLabel"));
		JavascriptExecutor excute=(JavascriptExecutor)driver;
		excute.executeScript("arguments[0].click();", user);
		
	    WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
	  
		driver.close();
		
}}
