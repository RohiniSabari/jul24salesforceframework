package com.sales1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Accounttab {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tekarch-a9-dev-ed.develop.my.salesforce.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("rohini@tekarch.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Chennai12p1");
		WebElement button=driver.findElement(By.id("Login"));
		button.click();
		
		
WebElement act=driver.findElement(By.xpath("//li[@id='Account_Tab']"));

act.sendKeys(Keys.TAB);
act.sendKeys(Keys.ENTER);
WebElement account=driver.findElement(By.xpath("//a[contains(@text,'Accounts')]"));
account.click();


WebElement newbtn=driver.findElement(By.name("new"));
newbtn.click();
WebElement accountname=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
accountname.sendKeys("rr");
WebElement sav=driver.findElement(By.name("save"));
sav.click();
driver.quit();

	}

}
