package com.sales1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {
	public logoutpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
@FindBy(id="username")
		public WebElement username;
@FindBy(id="password")
public WebElement password;
@FindBy(id="Login")
public WebElement loginbutton;

@FindBy(id="userNavLabel")
public WebElement usermenu;

@FindBy(xpath="//a[@title='Logout']")
public WebElement logoutbutton;




}
