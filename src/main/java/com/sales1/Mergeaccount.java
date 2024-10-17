package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Mergeaccount {

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
WebElement accounts= driver.findElement(By.id("Account_Tab"));
accounts.click();



WebElement mergeacc= driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
mergeacc.click();
WebElement fb = driver.findElement(By.id("srch"));
fb.clear();
fb.sendKeys("Rohini");
WebElement findacc= driver.findElement(By.name("srchbutton"));
findacc.click();

WebElement Button1 = driver.findElement(By.xpath("//input[@id='cid0']"));
Button1.click();
WebElement Button2 = driver.findElement(By.xpath("//input[@id='cid1']"));
Button2.click();
WebElement Button3 = driver.findElement(By.xpath("//input[@id='cid2']"));
Button3.click();

WebElement Next = driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]"));
Next.click();    
WebElement Merge = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
Merge.click();	    
	
driver.close();
System.out.println("TC13_MergeAccounts is completed");
	}

}
