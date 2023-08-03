package com.xyzbank.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.AccountPage;
import com.xyzbank.qa.pages.BankManagerLoginPage;
import com.xyzbank.qa.pages.CustomerLoginPage;
import com.xyzbank.qa.pages.CustomerslistPage;
import com.xyzbank.qa.pages.Homepage;

public class SearchCustomerTest extends TestBase {

	Homepage hp;
	BankManagerLoginPage bmlp;
	CustomerslistPage clp;
		
	public SearchCustomerTest() throws IOException 
	{
		super();		
	}
		
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		hp=new Homepage();
		bmlp=new BankManagerLoginPage();
		clp=new CustomerslistPage();		
	}
	
	@Test
	public void verifySearch() throws Exception
	{
	    String searchingName = "Harry";
		bmlp=hp.managerloginBtn();
		clp=bmlp.clickCustomersTab();
		clp.search(searchingName);
		String name = clp.getSearchedName();
		Assert.assertEquals(searchingName, name);
		System.out.println(name +" "+ searchingName);
		Thread.sleep(2000);
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
