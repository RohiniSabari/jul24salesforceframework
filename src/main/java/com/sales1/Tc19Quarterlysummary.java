package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc19Quarterlysummary {

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
WebElement opport=driver.findElement(By.id("Opportunity_Tab"));
opport.click();
WebElement Interval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
Interval.click();
Select s=new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
s.selectByVisibleText("Next FQ");
Select s1=new Select(driver.findElement(By.xpath("//select[@id='open']")));
s1.selectByVisibleText("Open Opportunities");
Thread.sleep(3000);
WebElement RunReport = driver.findElement(By.xpath("//input[@title='Run Report']"));
RunReport.click();
Thread.sleep(3000);
driver.close();

	}
}
