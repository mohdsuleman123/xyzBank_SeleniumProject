package com.xyzbank.qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.AccountPage;
import com.xyzbank.qa.pages.CustomerLoginPage;
import com.xyzbank.qa.pages.Homepage;

public class TC002_LoginTest extends TestBase {

	Homepage hp;
	CustomerLoginPage cp;
	AccountPage ap;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		hp = new Homepage();
		cp = new CustomerLoginPage();
		ap = new AccountPage();
	}

	@Test
	public void verifyLogin() throws Exception {
		cp = hp.customerLoginbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cp.selectUser();
		String EXPname = cp.selectUser();
		ap = cp.clickloginbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String ActUser = ap.getUserName();
		System.out.println(EXPname + "  and   " + ActUser);
		Assert.assertEquals(EXPname, ActUser, "Selected user is not logged in...");
	}
}

