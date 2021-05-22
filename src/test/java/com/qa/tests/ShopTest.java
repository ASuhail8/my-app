package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.CheckoutPage;
import com.qa.pages.ProtoCommerceHomePage;
import com.qa.pages.ShopPage;
import com.qa.utils.BaseTest;

public class ShopTest extends BaseTest {

	@Test
	public void orderAProduct() {

		String[] prod = { "Samsung Note 8", "iphone X", "Nokia Edge" };

		ProtoCommerceHomePage hp = new ProtoCommerceHomePage(driver);
		hp.clickOnShop();

		ShopPage sp = new ShopPage(driver);

		sp.clickProduct(prod);

		sp.clickCheckout();

		CheckoutPage cp = new CheckoutPage(driver);
		cp.validateHeading(prod);

	}

}
