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
	
	        @FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']//div//strong//span")
	        WebElement userName;
	        
	    //Deposit elements
			@FindBy(xpath = "(//button[contains(.,'Deposit')])[1]")
			WebElement depositTab;
	
			@FindBy(xpath = "//input[@placeholder='amount']")
			WebElement depositamountField;
			
			@FindBy(xpath = "(//button[contains(.,'Deposit')])[2]")
			WebElement depositButton;
			
			@FindBy(xpath = "//span[contains(.,'Deposit Successful')]")
			WebElement depositSuccessMsg;
			
		//Withdrawl elements	
			@FindBy(xpath = "//button[contains(.,'Withdrawl')]")
			WebElement withdrawlTab;
			
			@FindBy(xpath = "//input[@placeholder='amount']")
			WebElement withdrawlAmountField;
			
			@FindBy(xpath = "(//button[contains(.,'Withdraw')])[2]")
			WebElement withdrawlButton;
					
			@FindBy(xpath = "//span[contains(.,'Transaction successful')]")
			WebElement withdrawlSuccessMsg;
			
			public String getUserName()
			{
				return userName.getText();
			}
			
		//Deposit Actions	
			public void clickDepositTab()
			{
				depositTab.click();
			}
			public void enterDepositAmount(String amount)
			{
				depositamountField.sendKeys(amount);
			}
			public void clickDepositButton()
			{
				depositButton.click();
			}
			public String getDepositSuccessMSG()
			{
				return depositSuccessMsg.getText();
			}	
			
	   //Withdrawl Actions		
			public void clickWithdrawlTab()
			{
				withdrawlTab.click();
			}
			public void enterWithdrawlAmount(String amount)
			{
				withdrawlAmountField.sendKeys(amount);
			}
			public void clickWithdrawlButton()
			{
				withdrawlButton.click();
			}
			public String getWithdarwlSuccessMSG()
			{
				return withdrawlSuccessMsg.getText();
			}	

}
