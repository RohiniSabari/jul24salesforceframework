package com.sales1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Tc11createnewview {

	
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
	WebElement CreateNewView = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	CreateNewView.click();
	WebElement ViewName = driver.findElement(By.xpath("//input[@id=\"fname\"]"));
	ViewName.sendKeys("iefjkeff");
	WebElement ViewUniqueName = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
	ViewUniqueName.clear();
	ViewUniqueName.sendKeys("ohrowehgf");
	Thread.sleep(2000);
	WebElement Save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	Save.click();
	Thread.sleep(2000);
driver.close();
}
}


