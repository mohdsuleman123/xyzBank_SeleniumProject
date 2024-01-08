package com.xyzbank.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.Homepage;

public class TC001_HomepageTest extends TestBase {
	Homepage hp;

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		hp = new Homepage();
	}

	@Test(priority = 1)
	public void homePageTest() throws InterruptedException {
		String explogo = hp.verifyLogoText();
		Assert.assertEquals(explogo, "XYZ Bank", "Expected logo text is not present");
		String expTitle = hp.getPageTitle();
		Assert.assertEquals(expTitle, "XYZ Bank", "Expected title is not present");
		String actUrl = hp.getPageURL();
		Assert.assertEquals(actUrl, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login",
				"Expected url is not present");
		System.out.println(actUrl);
	}
}
