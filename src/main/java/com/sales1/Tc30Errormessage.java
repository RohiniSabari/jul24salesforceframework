package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc30Errormessage {
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
WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
Uniquename.sendKeys("EFGH");
WebElement Save = driver.findElement(By.name("save"));
Save.click();
String actualmsg = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]")).getText();
String errormsg = "Error: You must enter a value";
if(actualmsg.equals(errormsg))
{
	System.out.println("TestCase is passed");

}else
{
System.out.println("TestCase is failed");
}
driver.close();
}}
