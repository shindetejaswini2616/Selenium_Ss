package com.ShopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z')]")
	private WebElement accountBtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myprofileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getAccountBtn() {
		return accountBtn;
	}

	public WebElement getMyprofileBtn() {
		return myprofileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
}
