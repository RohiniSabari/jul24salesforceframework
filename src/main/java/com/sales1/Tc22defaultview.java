package com.sales1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Tc22defaultview {
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
view.selectByIndex(1);
Thread.sleep(3000);
WebElement UserMenu = driver.findElement(By.id("userNavLabel"));
UserMenu.click();
WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
logout.click();
Thread.sleep(2000);
WebElement username1= driver.findElement(By.xpath("//input[@id='username']"));
username1.sendKeys("rohini@tekarch.com");
WebElement pwd1 = driver.findElement(By.xpath("//input[@id='password']"));
pwd1.clear();
pwd1.sendKeys("Chennai12p1");
WebElement login1 = driver.findElement(By.xpath("//*[@id='Login']"));
login1.click();
Thread.sleep(3000);
WebElement Leadslink = driver.findElement(By.id("Lead_Tab"));
Leadslink.click();
Thread.sleep(3000);
driver.close();
}
}