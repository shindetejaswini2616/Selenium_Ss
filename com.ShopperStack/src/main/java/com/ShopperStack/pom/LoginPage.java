package com.ShopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailTf;
	
	@FindBy(id="Password")
	private WebElement pswTf;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginBtn;
	
	

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPswTf() {
		return pswTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
