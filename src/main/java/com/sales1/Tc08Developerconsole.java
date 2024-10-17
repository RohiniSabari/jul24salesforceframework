package com.sales1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc08Developerconsole {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("rohini@tekarch.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Chennai12p1");
		WebElement button=driver.findElement(By.id("Login"));
		button.click();
//Developer concole
Thread.sleep(3000);
WebElement usermenu1=driver.findElement(By.xpath("//*[@id='userNav-arrow']"));
usermenu1.click();
WebElement developerconsole=driver.findElement(By.linkText("Developer Console"));
developerconsole.click();
Thread.sleep(3000);
Set<String> getAllWindows=driver.getWindowHandles();
String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
driver.switchTo().window(window[1]).close();
System.out.println("developerconsole completed");
driver.quit();

	}

}
