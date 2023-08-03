package com.xyzbank.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyzbank.qa.base.TestBase;

public class AccountPage extends TestBase  {

	public AccountPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	  //elements
			@FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']//div//strong//span")
			WebElement userName;
	
			
		//Actions	
			public String getUserName()
			{
				return userName.getText();
			}
	
	
}
