package com.sales1;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc07Mysettings {

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
Thread.sleep(2000);
//personal settings
 WebElement personal=driver.findElement(By.xpath("//*[@id=\"PersonalInfo\"]/a"));
 
personal.click();
WebElement loginhistory=driver.findElement(By.id("LoginHistory_font"));
loginhistory.click();
WebElement LoginHistory6Months= driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
LoginHistory6Months.click();


//click display and layout font and add tab salesforce chatter and reports
WebElement display=driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout_font\"]"));
display.click();
WebElement customize=driver.findElement(By.id("CustomizeTabs_font"));
customize.click();
Select s=new Select(driver.findElement(By.id("p4")));
s.selectByVisibleText("Salesforce Chatter");
Select s1=new Select(driver.findElement(By.id("duel_select_0")));
s1.selectByVisibleText("Reports");
Thread.sleep(3000);
WebElement add=driver.findElement(By.xpath("//img[contains(@alt,'Add')]"));
add.click();
WebElement add1=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
add1.click();

//click Email 
WebElement Email = driver.findElement(By.id("EmailSetup"));
Email.click();
WebElement email=driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]"));
email.click();
WebElement Email_Name = driver.findElement(By.id("sender_name"));
Email_Name.clear();
Email_Name.sendKeys("Rohini R");
WebElement Email_Address = driver.findElement(By.id("sender_email"));
Email_Address.clear();
Email_Address.sendKeys("rohinirajandran@tekarch.com");
WebElement Bcc_radioButton = driver.findElement(By.id("auto_bcc1"));
Bcc_radioButton.click();
WebElement Save_button = driver.findElement(By.name("save"));
Save_button.click();		

//calendar and reminder

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
driver.close();



	}
	
}
