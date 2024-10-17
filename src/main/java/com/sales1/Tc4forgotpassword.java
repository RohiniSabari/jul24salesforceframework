package com.sales1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc4forgotpassword {
	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new EdgeDriver();
	driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("rohini@tekarch.com");
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Chennai12p");
	WebElement button=driver.findElement(By.id("Login"));
	button.click();
	 String actualText = driver.findElement(By.xpath("//div[@id='error']")).getText();
		driver.manage().window().maximize();
		String expectedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	    if(actualText.equalsIgnoreCase(expectedText))
		 System.out.println("Error message Displayed"); 
		  else
		 System.out.println("Error message not Displayed please check the application");
		 
		
		System.out.println("Forgot password completed");
		driver.close();
Thread.sleep(3000);
}}
