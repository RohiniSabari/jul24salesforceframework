package com.sales1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class Tc06Myprofile {

		public static void main(String[] args) throws InterruptedException  {
			
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

	//Actions ac=new Actions(driver);
	//ac.moveToElement(user).build().perform();
	JavascriptExecutor excute=(JavascriptExecutor)driver;
	excute.executeScript("arguments[0].click();", user);
	//myprofile and post link
	WebElement myprofile1=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	myprofile1.click();
	Thread.sleep(3000);
	  WebElement postlink =  driver.findElement(By.id("publisherAttachTextPost")); 
	postlink.click();
	 WebElement postIframe = driver .findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]"));
	driver.switchTo().frame(postIframe); 
	  WebElement postBody = driver.findElement(By.xpath("//html[1]/body[1]"));
	 postBody.click(); 
	  postBody.sendKeys("This is posted Text"); 
	  driver.switchTo().defaultContent();
	  WebElement ShareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	  ShareButton.click();
	  
	  //file link
	  Thread.sleep(3000);
	  WebElement File= driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
	  File.click();
	 Thread.sleep(3000);
	  WebElement Upload= driver.findElement(By.id("chatterUploadFileAction"));
	 Upload.click();
	  
	  Thread.sleep(3000); 
	  WebElement choosefile =driver.findElement(By.id("chatterFile"));
	  choosefile.sendKeys("C:\\Users\\Rohini\\Documents\\newexcel.xlsx");
	  
	  WebElement Share = driver.findElement(By.id("publishersharebutton"));
	Share.click();
	//upload photo
	WebElement edit=driver.findElement(By.id("displayBadge"));

	Thread.sleep(2000);
	Actions action=new Actions(driver);
	   action.moveToElement(edit).build().perform();
	WebElement addphoto= driver.findElement(By.xpath("//a[@id='uploadLink']"));
addphoto.click();
driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
	driver.switchTo().frame("uploadPhotoContentId");
	WebElement file= driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));

	file.sendKeys("C:\\Rohini\\flower.jpeg");
	WebElement save = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
	save.click();
	
	System.out.println("MyProfile completed");
		driver.quit();

	
		}

}
