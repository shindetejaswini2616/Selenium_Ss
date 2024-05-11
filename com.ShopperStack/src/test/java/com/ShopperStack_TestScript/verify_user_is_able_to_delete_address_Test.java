package com.ShopperStack_TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStack.GenericUtility.BaseTest;
import com.ShopperStack.GenericUtility.ListenersUtility;
import com.ShopperStack.pom.MyAddressPage;
import com.ShopperStack.pom.MyProfilePage;
@Listeners(ListenersUtility.class)
public class verify_user_is_able_to_delete_address_Test extends BaseTest{
	@Test
	public void deleteAddress() throws InterruptedException
	{
		homePage.getAccountBtn().click();
		homePage.getMyprofileBtn().click();
		
		MyProfilePage myProfilePage=new MyProfilePage(driver);
		myProfilePage.getMyaddressBtn().click();
		
		MyAddressPage addressPage=new MyAddressPage(driver);
		Thread.sleep(2000);
		addressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		addressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

}
