package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class tC10Createaccount {

	public static void main(String[] args) throws InterruptedException {
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
WebElement accounts= driver.findElement(By.id("Account_Tab"));
accounts.click();
////*[@id="hotlist"]/table/tbody/tr/td[2]/input(absolute xpath)
WebElement New = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
New.click();
WebElement AccountName = driver.findElement(By.id("acc2"));
AccountName.clear();
AccountName.sendKeys("abc");
WebElement Save = driver.findElement(By.name("save"));
Save.click();
System.out.println("account saved");
driver.quit();

	}

}
