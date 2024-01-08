package com.xyzbank.qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.BankManagerLoginPage;
import com.xyzbank.qa.pages.Homepage;
import com.xyzbank.qa.pages.OpenAccountPage;

public class TC004_OpenNewAccountTest extends TestBase {

	Homepage hp;
	BankManagerLoginPage bmlp;
	OpenAccountPage oap;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		hp = new Homepage();
		bmlp = new BankManagerLoginPage();
		oap = new OpenAccountPage();
	}

	@Test(priority = 3)
	public void createAccount() throws Exception {
		bmlp = hp.managerLoginBtn();
		oap = bmlp.clickopenAccountTab();
		oap.selectCustomer();
		oap.selectCurrency();
		oap.clickProcessBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String alertmsg = oap.acceptAlert();
		System.out.println(alertmsg);
	}
}
