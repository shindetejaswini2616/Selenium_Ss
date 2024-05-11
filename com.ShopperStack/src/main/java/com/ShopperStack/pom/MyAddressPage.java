package com.ShopperStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;
	
	@FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i')])[2]" )
	private WebElement deleteBtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	
}
