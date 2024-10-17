package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc34verifyeditlastname {
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
 WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
 home.click();
 WebElement namelink=driver.findElement(By.className("currentStatusUserName"));
 namelink.click();
 String homepage = driver.getWindowHandle();
 System.out.println("homepage is displayed");
 WebElement Edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
 Edit.click();
 //driver.findElement(By.id("contactTab")).click();
 driver.switchTo().frame("contactInfoContentId");

WebElement about=driver.findElement(By.xpath("//li[@id='aboutTab']"));
about.click();

Thread.sleep(3000);
WebElement lastname = driver.findElement(By.id("lastName"));
lastname.clear();
lastname.sendKeys("Raj");
WebElement saveall=driver.findElement(By.xpath("//input[@value=\"Save All\"]"));
saveall.click();
driver.switchTo().defaultContent();
driver.close();
System.out.println("EditedLastName Executed sucessfully");
 driver.close();
}}


