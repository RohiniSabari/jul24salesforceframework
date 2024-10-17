package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Tc35Cutomizetab {
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
 WebElement home=driver.findElement(By.className("allTabsArrow"));
 home.click();
 WebElement customize=driver.findElement(By.name("customize"));
 customize.click();
 WebElement Chatter = driver.findElement(By.xpath("//option[@value='Chatter']"));
Chatter.click();
  WebElement leftarrow = driver.findElement(By.className("leftArrowIcon"));
 leftarrow.click();
  WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
 save.click();
 WebElement user=driver.findElement(By.id("userNavLabel"));
	JavascriptExecutor excute=(JavascriptExecutor)driver;
	excute.executeScript("arguments[0].click();", user);
 WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
	logout.click();
 Thread.sleep(3000);
 WebElement Uname1=driver.findElement(By.xpath("//input[@id='username']"));
	Uname1.sendKeys("rohini@tekarch.com");
	WebElement pwd1=driver.findElement(By.xpath("//input[@id='password']"));
	pwd1.clear();
	pwd1.sendKeys("Chennai12p1");
  WebElement login1 = driver.findElement(By.xpath("//*[@id='Login']"));
login1.click();
 driver.close();
}
}
