package com.ShopperStack_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStack.GenericUtility.BaseTest;
import com.ShopperStack.GenericUtility.ListenersUtility;
import com.ShopperStack.pom.AddressFormPage;
import com.ShopperStack.pom.MyAddressPage;
import com.ShopperStack.pom.MyProfilePage;
import com.aventstack.extentreports.Status;
@Listeners(ListenersUtility.class)
public class Verify_user_able_to_add_address_Test extends BaseTest{
	@Test
	public void addAdress() throws EncryptedDocumentException, IOException
	{
		homePage.getAccountBtn().click();
		homePage.getMyprofileBtn().click();
		test.log(Status.INFO, "myProfile Page Open");
		MyProfilePage myProfilePage=new MyProfilePage(driver);
		myProfilePage.getMyaddressBtn().click();
		
		test.log(Status.INFO, "MyAddress Page Open");
		MyAddressPage myAddressPage=new MyAddressPage(driver);
		myAddressPage.getAddAddressBtn().click();
		
		test.log(Status.INFO, "Address Form Page Page Open");
		AddressFormPage myAddressFormPage=new AddressFormPage(driver);
		myAddressFormPage.getNameTf().sendKeys(file.readExcelData("Sheet1", 1, 0));
		myAddressFormPage.getHouseTf().sendKeys(file.readExcelData("Sheet1", 1, 1));
		myAddressFormPage.getStreetTf().sendKeys(file.readExcelData("Sheet1", 1, 2));
		myAddressFormPage.getLandmarkTf().sendKeys(file.readExcelData("Sheet1", 1, 3));
		webdriverUtil.selectByValue(myAddressFormPage.getCountryDd(), file.readPropertyData("Country"));
		webdriverUtil.selectByValue(myAddressFormPage.getStateDd(), file.readPropertyData("state"));
		webdriverUtil.selectByValue(myAddressFormPage.getCityDd(), file.readPropertyData("city"));
		myAddressFormPage.getPincodeTf().sendKeys(file.readExcelData("Sheet1", 1, 4));
		myAddressFormPage.getPhoneTf().sendKeys(file.readExcelData("Sheet1", 1, 5));
		myAddressFormPage.getAddressBtn().click();
	}
}
