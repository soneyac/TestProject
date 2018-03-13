package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mainclass.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy (className="img-responsive")
	WebElement logo;
	
	@FindBy (xpath="//a[text()='Forgot Password?']")
	WebElement forgotPasswordLink;
	
	@FindBy (xpath="//a[text()='Sign Up']")
	WebElement signup;
	
	@FindBy (xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy (xpath="//input[@type='submit' ]")
	WebElement button;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String gettitle(){
		return driver.getTitle();
		
	}
	
	public boolean logoPresentTest(){
		return logo.isDisplayed();
	}
	
	public void clickOnForgotPassword(){
		System.out.println("Clicking on Forgot Password");
		forgotPasswordLink.click();
	}
	
	public homePage login(String uname, String pwd){
		System.out.println("Entering username");
		username.sendKeys(uname);
		System.out.println("Entering password");
		password.sendKeys(pwd);
		System.out.println("Clicking on the Login button");
		button.click();
		return new homePage();
	}
}
