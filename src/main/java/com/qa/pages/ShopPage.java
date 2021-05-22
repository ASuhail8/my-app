package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.BasePage;

public class ShopPage extends BasePage {

	public ShopPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div//h4[@class='card-title']//a")
	List<WebElement> products;

	@FindBy(css = ".btn.btn-info")
	List<WebElement> addToCart;

	@FindBy(css = ".nav-link.btn.btn-primary")
	WebElement checkOut;

	public void clickProduct(String[] prod) {
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			for (int j = 0; j < prod.length; j++) {
				if (product.equals(prod[j+1]))
					addToCart.get(i).click();
			}
		}
	}

	public void clickCheckout() {
		checkOut.click();
	}

}
