package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc31errormessagecancelbutton {
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
 WebElement lead=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
lead.click();
WebElement createnew= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
createnew.click();
WebElement name = driver.findElement(By.name("fname"));
name.sendKeys("ABCD");
WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
Uniquename.sendKeys("EFGH");
WebElement cancel = driver.findElement(By.name("cancel"));
cancel.click();
Thread.sleep(3000);
driver.close();}
}
