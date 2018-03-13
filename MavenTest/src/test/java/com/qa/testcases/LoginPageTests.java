package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.mainclass.BaseClass;
import com.qa.pages.LoginPage;
import com.qa.pages.homePage;

public class LoginPageTests extends BaseClass{
	LoginPage lp;
	homePage hp;
	public LoginPageTests(){
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		System.out.println("Initiating the test");
		initialization();
		lp=new LoginPage();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority=1)
	public void titleTest(){
		Assert.assertEquals(lp.gettitle(), "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test(priority=2)
	public void logoPresent(){
		Assert.assertTrue(lp.logoPresentTest());
	}
	
	@Test(priority=3)
	public void loginTest(){
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		//Assert.assertEquals(actual, expected);
	}

}
