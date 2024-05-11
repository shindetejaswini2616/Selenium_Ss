package com.ShopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@id,'loginBtn')]")
	private WebElement logintBtn;

	public WebElement getLogintBtn() {
		return logintBtn;
	}
	
	
}
