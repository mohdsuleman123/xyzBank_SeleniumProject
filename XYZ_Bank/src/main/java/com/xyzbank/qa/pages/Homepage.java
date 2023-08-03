package com.xyzbank.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyzbank.qa.base.TestBase;

public class Homepage extends TestBase {

	public Homepage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	//elements
	@FindBy(xpath = "//button[contains(.,'Customer Login')]")
	WebElement customerlogin;

	@FindBy(xpath ="//button[contains(.,'Bank Manager Login')]")
	WebElement managerlogin;
	
	@FindBy(xpath ="//strong[contains(.,'XYZ Bank')]")
	WebElement logo;
	
	
	//Actions   
	public String verifyLogoText()
	{
		return logo.getText();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();		
	}
	
	public String getPageURL()
	{
		return driver.getCurrentUrl();		
	}
	
	public CustomerLoginPage customerloginbtn() throws IOException
	{
		customerlogin.click();
		return new CustomerLoginPage();
	}
	
	public BankManagerLoginPage managerloginBtn() throws IOException
	{
		managerlogin.click();
		
		return new BankManagerLoginPage();
	}
}
