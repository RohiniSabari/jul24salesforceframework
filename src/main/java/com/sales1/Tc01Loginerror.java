package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc01Loginerror {

	
		public static void main(String[] args) throws InterruptedException  {
			WebDriver driver=new EdgeDriver();
			driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
			WebElement username=driver.findElement(By.id("username"));
			username.sendKeys("rohini@tekarch.co");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Chennai12p1");
			WebElement button=driver.findElement(By.id("Login"));
			button.click();
			 driver.findElement(By.xpath("//div[@id='error']")).getText();
			
				String errormessage =driver.findElement(By.xpath("//div[@id='error']")).getText(); 
				if(errormessage.equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.."))
				
					System.out.println("Error message is displayed"); 
				
				else 
						  System.out.println("Error message is not displayed"); 
						
						 Thread.sleep(3000);
						 driver.close();
						 
	}

}
