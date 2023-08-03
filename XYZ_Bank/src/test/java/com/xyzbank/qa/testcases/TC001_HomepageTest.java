package com.xyzbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.Homepage;

public class TC001_HomepageTest extends TestBase
{
	Homepage hp;
	
	public TC001_HomepageTest() throws IOException 
	{
		super();
	}
		
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		hp=new Homepage();
	}
	
	@Test(priority = 1)
	public void homePageTest() throws InterruptedException
	{
		String explogo = hp.verifyLogoText();
		Assert.assertEquals(explogo, "XYZ Bank","Expected logo text not present");
		String expTitle = hp.getPageTitle();
		Assert.assertEquals(expTitle, "XYZ Bank", "Expected title not present");
		String actUrl = hp.getPageURL();
		Assert.assertEquals(actUrl, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login" ,"Expected url not present");
		System.out.println(actUrl);
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
