package com.sales1;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc16NewOpportunity {
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
	WebElement new1= driver.findElement(By.xpath("//input[contains(@title,'New')]"));
	new1.click();
	WebElement Oppname = driver.findElement(By.id("opp3"));
	Oppname.clear();
	Oppname.sendKeys("riyaa");
	Thread.sleep(3000);
	WebElement LookupWindow = driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']"));
	LookupWindow.click();
	String oldWindow = driver.getWindowHandle();
	Set<String> getAllWindows = driver.getWindowHandles();
	String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	driver.switchTo().window(getWindow[1]);
	Thread.sleep(3000);
	driver.switchTo().frame("searchFrame");
	driver.findElement(By.id("lksrch")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='go']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("resultsFrame");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//tr[@class='dataRow even last first']/th/a")).click();
	driver.switchTo().window(getWindow[0]);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='opp9']")).click();
    WebElement today=driver.findElement(By.xpath("//a[@class='calToday']"));
	today.click();
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ESCAPE).build().perform();
	WebElement Stage = driver.findElement(By.xpath("//select[@id='opp11']"));
	Stage.click();
	Select dropdown = new Select(Stage);
	dropdown.selectByValue("Qualification");
	driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("80");
	WebElement Save = driver.findElement(By.xpath("//td[@id='bottomButtonRow']"));
	Save.click();
	driver.close();
	System.out.println("CreatenewOpp is completed");
}}
