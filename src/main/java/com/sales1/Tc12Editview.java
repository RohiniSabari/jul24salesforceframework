package com.sales1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc12Editview {
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
	WebElement View = driver.findElement(By.xpath("//select[@id='fcf']"));
	View.click();
    Select dropdown = new Select(driver.findElement(By.id("fcf")));
    dropdown.selectByIndex(1);
		
	WebElement EditLink = driver.findElement(By.linkText("Edit"));
	EditLink.click();
	WebElement viewname=driver.findElement(By.id("fname"));
	viewname.clear();
	viewname.sendKeys("shalini");
	WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
	Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
	accfield.selectByIndex(1);
	WebElement Operator = driver.findElement(By.xpath("//select[@id='fcol1']"));
	Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
	operator.selectByIndex(3);
		
	WebElement value = driver.findElement(By.id("fval1"));
	value.clear();
	value.sendKeys("<a>");
	WebElement dropdown1= driver.findElement(By.xpath("//*[@id='colselector_select_0']"));
		Select Availablelist = new Select(dropdown1);
		List<WebElement> options = Availablelist.getOptions();

		boolean Element_available = false; 
		
		for(int i=0; i<options.size(); i++) {
			if(options.get(i).getText().equals("Last Activity")) {
				Element_available = true;
				WebElement Add= driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
				Add.click();
				break;
			}
		}
Thread.sleep(3000);
		if(Element_available = false) {
			WebElement dropdown11 = driver.findElement(By.xpath("//select[@id='colselector_select_1']"));
			Select Selectedlist = new Select(dropdown11);
			List<WebElement> Selectedoptions = Selectedlist.getOptions();

			for(int i=0; i<options.size(); i++) {
				if(Selectedoptions.get(i).getText().equals("Last Activity")) {
					break;
				}
			}	
		}
Thread.sleep(3000);
driver.findElement(By.name("save")).click();
	
	driver.close();
	
		
	}
}
	
	
	
	


