package com.sales1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
@FindBy(id="username")
		public WebElement username;
@FindBy(id="password")
public WebElement password;
@FindBy(id="Login")
public WebElement loginbutton;

@FindBy(name="rememberUn")
public WebElement rememeberme;
@FindBy(id="forgot_password_Link")
public WebElement forgotpassword;
@FindBy(id="hint_back_chooser")
public WebElement savedusername;

}
