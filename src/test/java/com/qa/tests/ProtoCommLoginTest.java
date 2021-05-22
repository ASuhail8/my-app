package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.ProtoCommerceHomePage;
import com.qa.utils.BaseTest;

public class ProtoCommLoginTest extends BaseTest {

	@Test
	public void login() {

		ProtoCommerceHomePage hp = new ProtoCommerceHomePage(driver);

		hp.enterName();
		hp.enterEmail();
		hp.enterPassword();
		hp.clickOnStudentCB();
		hp.clickOnSubmit();
		hp.verifySuccessMsg();
	}

}
