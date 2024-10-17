package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Tc24CheckNewButton {
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
Thread.sleep(3000);
WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
New.click();
WebElement LeadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
LeadStatus.click();
WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
LastName.sendKeys("Ram");
WebElement Company = driver.findElement(By.xpath("//input[@id='lea3']"));
Company.sendKeys("Bank");

WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
SaveButton.click();
Thread.sleep(2000);
driver.close();
	}


}
