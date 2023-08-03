package com.xyzbank.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.BankManagerLoginPage;
import com.xyzbank.qa.pages.Homepage;
import com.xyzbank.qa.pages.OpenAccountPage;

public class TC004_OpenNewAccountTest extends TestBase{

	Homepage hp;
	BankManagerLoginPage bmlp;
	OpenAccountPage oap;
	
	public TC004_OpenNewAccountTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		hp=new Homepage();
		bmlp=new BankManagerLoginPage();
		oap=new OpenAccountPage();
	}
	
	@Test(priority = 3)
	public void createAccount() throws Exception
	{
		bmlp=hp.managerloginBtn();
		oap=bmlp.clickopenAccountTab();
		oap.selectCustomer();
		oap.selectCurrency();
		Thread.sleep(1000);
		oap.clickProcessBtn();
		Thread.sleep(1000);
		String alertmsg = oap.acceptAlert();
		System.out.println(alertmsg);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}		
}
