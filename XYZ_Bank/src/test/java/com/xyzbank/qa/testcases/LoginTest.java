package com.xyzbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.AccountPage;
import com.xyzbank.qa.pages.CustomerLoginPage;
import com.xyzbank.qa.pages.Homepage;

public class LoginTest extends TestBase {

	Homepage hp;
	CustomerLoginPage cp;
	AccountPage ap;
	
	public LoginTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		hp=new Homepage();
		cp=new CustomerLoginPage();
		ap=new AccountPage();
	}
	
	@Test(priority = 2)
	public void verifyLogin() throws Exception
	{
		cp=hp.customerloginbtn();
		Thread.sleep(1000);
		cp.selectUser();
		String EXPname=cp.selectUser();
		Thread.sleep(1000);	
		ap=cp.clickloginbtn();
		String ActUser = ap.getUserName();
		System.out.println(EXPname + "  and   "+ ActUser);
		Assert.assertEquals(EXPname, ActUser ,"Selected user is not logged in...");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
