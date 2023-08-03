package com.xyzbank.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.xyzbank.qa.base.TestBase;

public class CustomersPage extends TestBase {

	public CustomersPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
