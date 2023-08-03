package com.xyzbank.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xyzbank.qa.base.TestBase;

public class OpenAccountPage extends TestBase {

	public OpenAccountPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	//elements
	@FindBy(xpath = "(//select)[1]")
	WebElement customerDropdown;
	
	@FindBy(xpath = "(//select)[2]")
	WebElement currencyDropdown;
	
	@FindBy(xpath = "//button[contains(.,'Process')]")
	WebElement processBtn;
	
	//Actions     
	
	public void selectCustomer()
	{
		Select sc=new Select(customerDropdown);
		sc.selectByIndex(2);
	}
	
	public void selectCurrency()
	{
		Select sc=new Select(currencyDropdown);
		sc.selectByIndex(1);
	}
	
	public void clickProcessBtn()
	{
		processBtn.click();
	}
	
	public String acceptAlert()
	{
		Alert al = driver.switchTo().alert();
		String alText = al.getText();
		al.accept();
		
		return alText;
	}
	
	
	
}
