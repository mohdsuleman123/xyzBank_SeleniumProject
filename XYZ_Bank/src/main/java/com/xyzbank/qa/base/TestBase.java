package com.xyzbank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException 
	{

			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\mohammed.suleman\\eclipse-workspace\\XYZ_Bank"
					+ "\\src\\main\\java\\com\\xyzbank\\qa\\config\\config.properties");
			prop.load(ip);
		//	prop.getProperty("url");

	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
    }

}