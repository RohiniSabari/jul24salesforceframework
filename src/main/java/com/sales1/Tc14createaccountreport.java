package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc14createaccountreport {
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
WebElement last= driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
last.click();
WebElement  dropdown = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
dropdown.click();
WebElement createddate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
createddate.click();
WebElement startdate =  driver.findElement(By.name("startDate"));
startdate.clear();
startdate.sendKeys("09/01/2024");
WebElement enddate = driver.findElement(By.name("endDate"));
enddate.clear();
enddate.sendKeys("12/01/2024");
WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
save.click();
WebElement Reportnames =  driver.findElement(By.name("reportName"));
Reportnames.clear();
Reportnames.sendKeys("Accountreports");
WebElement ReportUniName =  driver.findElement(By.id("saveReportDlg_DeveloperName"));
ReportUniName.clear();
Thread.sleep(3000);
ReportUniName.sendKeys("ChangeReportUniqueName");
Thread.sleep(4000);
WebElement Saveandrun = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
Saveandrun.click();
Thread.sleep(3000);
driver.close();
System.out.println("Createaccountreport is completed");
}
}


