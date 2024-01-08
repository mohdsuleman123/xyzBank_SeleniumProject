package com.xyzbank.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyzbank.qa.base.TestBase;

public class AddCustomerPage extends TestBase {

	public AddCustomerPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// elements
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastnameField;

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement postCodeField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement addCustomerBtn;

	// Actions
	public void enterFName(String fName) {
		firstNameField.sendKeys(fName);
	}

	public void enterLName(String lName) {
		lastnameField.sendKeys(lName);
	}

	public void enterPCode(String code) {
		postCodeField.sendKeys(code);
	}

	public void clickaddCustBtn() {
		addCustomerBtn.click();
	}

	public String acceptAlert() {
		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		al.accept();

		return alertText;
	}
}
