package com.xyzbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.AddCustomerPage;
import com.xyzbank.qa.pages.BankManagerLoginPage;
import com.xyzbank.qa.pages.Homepage;

public class TC003_AddNewCustomerTest extends TestBase{

	Homepage hp;
	AddCustomerPage acp;
	BankManagerLoginPage bmlp;
	
	public TC003_AddNewCustomerTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		hp=new Homepage();
		acp=new AddCustomerPage();
		bmlp=new BankManagerLoginPage();
	}
	
	@Test
	public void verifyManagerLogin() throws Exception
	{
		hp.managerloginBtn();
		bmlp.clickaddCustomerTab();
		Thread.sleep(1000);
		acp.enterFName();
		acp.enterLName();
		acp.enterPCode();
		acp.clickaddCustBtn();
		Thread.sleep(1000);
		String alertMsg = acp.acceptAlert();
		System.out.println(alertMsg);
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
