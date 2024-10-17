package com.sales1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendarandreminder {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("rohini@tekarch.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Chennai12p1");
		WebElement button=driver.findElement(By.id("Login"));
		button.click();

Thread.sleep(3000);
WebElement user=driver.findElement(By.id("userNavLabel"));

JavascriptExecutor excute=(JavascriptExecutor)driver;
excute.executeScript("arguments[0].click();", user);
Thread.sleep(2000);
WebElement myprofile1=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
myprofile1.click();
WebElement calendar=driver.findElement(By.id("CalendarAndReminders_font"));
calendar.click();
WebElement activityreminder=driver.findElement(By.id("Reminders_font"));
activityreminder.click();


WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.id("testbtn")));
	driver.findElement(By.id("testbtn")).click();
	System.out.println("reminder completed");

	WebElement submit=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	submit.click();
driver.quit();
	}

}
