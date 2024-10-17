package com.sales1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Tc02salesforcelogin {
		public static void main(String[] args) throws InterruptedException  {
	
			WebDriver driver=new EdgeDriver();
			driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
			if(driver.getTitle().equals("https://tekarch-a9-dev-ed.develop.my.salesforce.com/"))
			{
		System.out.println("Title matched");
		
	}
	else {
		System.out.println("Not matched");
	System.out.println(driver.getTitle());
}
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
	//Actions ac=new Actions(driver);
	//ac.moveToElement(user).build().perform();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout completed");
		
	   
	//WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			//logout.click();
			
	driver.close();
		
	}

	}
		
		
		
		
	


