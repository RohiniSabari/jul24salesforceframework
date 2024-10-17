package com.sales1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc15opportunity {
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
 WebElement opport=driver.findElement(By.id("Opportunity_Tab"));
 opport.click();
 Select view=new Select(driver.findElement(By.id("fcf")));
 List<WebElement> dd = view.getOptions();
//System.out.println(dd.size());
 for (int i= 0; i< dd.size(); i++) {
     System.out.println(dd.get(i).getText());

 }
driver.close();
 
}}
