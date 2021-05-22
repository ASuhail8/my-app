package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utils.BasePage;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div//h4[@class='media-heading']//a")
	List<WebElement> heading;

	public void validateHeading(String[] prod) {
		List<String> list = Arrays.asList(prod);
		List<Object> a = list.stream().sorted().collect(Collectors.toList());
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < heading.size(); i++) {
			String text = heading.get(i).getText();
			al.add(text);
		}
		List<Object> b = al.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(a.equals(b));
	}
}
