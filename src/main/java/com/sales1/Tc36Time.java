package com.sales1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc36Time {
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
 WebElement home=driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
 home.click();
 Thread.sleep(3000);
 WebElement datelink=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
datelink.click();
WebElement eightlink=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
eightlink.click();
driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();
Set<String>windowHandles=driver.getWindowHandles();

String currentHandle = driver.getWindowHandle();

windowHandles.remove(currentHandle);
String newHandle = windowHandles.iterator().next();
driver.switchTo().window(newHandle);
driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']")).click();
driver.switchTo().window(currentHandle);




Thread.sleep(2000);
WebElement Date = driver.findElement(By.xpath("//input[@id='EndDateTime']"));
Date.clear();
Date.sendKeys("9/8/2024");;
driver.findElement(By.xpath("//img[contains(@class,'calRight')]")).click();

WebElement date= driver.findElement(By.xpath("//tr[@id='calRow2']//td[contains(@class,'weekday')][contains(text(),'8')]"));
date.click();

WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
endtime.click();
driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
driver.findElement(By.xpath("//div[@id='timePickerItem_42']")).click();
driver.findElement(By.id("bottomButtonRow")).click();

  
driver.quit();} 
}
