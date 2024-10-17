package com.sales1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc21leadselectview {
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
 WebElement lead=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
lead.click();
WebElement leadselect= driver.findElement(By.xpath("//select[@id='fcf']"));
leadselect.click();
Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
List<WebElement>view1=view.getOptions();
for(int i=0;i<view1.size();i++)
{
	System.out.println(view1.get(i).getText());
}
driver.close();
	}
}
