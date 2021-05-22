package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.BasePage;

public class ProtoCommerceHomePage extends BasePage {

	@FindBy(name = "name")
	WebElement name;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "exampleInputPassword1")
	WebElement password;

	@FindBy(id = "inlineRadio1")
	WebElement studentCB;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement submitButton;

	By MSG_LOCATOR = By.xpath("//div[@class='alert alert-success alert-dismissible']//strong");

	@FindBy(linkText = "Shop")
	WebElement shop;

	public ProtoCommerceHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterName() {
		name.sendKeys("name");
	}

	public void enterEmail() {
		email.sendKeys("email");
	}

	public void enterPassword() {
		password.sendKeys("password");
	}

	public void clickOnStudentCB() {
		studentCB.click();
	}

	public void clickOnSubmit() {
		submitButton.click();
	}

	public void verifySuccessMsg() {
		validateMessage(MSG_LOCATOR, "Success");
	}

	public void clickOnShop() {
		shop.click();
	}

}
