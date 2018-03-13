package com.qa.testcases;

import junit.framework.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.mainclass.BaseClass;
import com.qa.pages.LoginPage;
import com.qa.pages.homePage;

public class HomePageTest extends BaseClass {
	LoginPage lp;
	homePage hp;
	public HomePageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		lp=new LoginPage();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	@Test
	public void UserId(){
		Assert.assertEquals(hp.getUserId(),prop.getProperty("userid"));
	}

}
