package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mainclass.BaseClass;

public class homePage extends BaseClass {
	@FindBy (xpath="//td[contains(text(),'Naveen K')]")
	WebElement userid;
	
	@FindBy (name="mainpanel")
	WebElement iframe;
	
	/*@FindBy (xpath="//td[contains(text(),'Naveen K')]")
	WebElement userid;
	
	@FindBy (xpath="//td[contains(text(),'Naveen K')]")
	WebElement userid;*/
	
	public homePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getUserId(){
		driver.switchTo().frame(iframe);
		return userid.getText();
	}
	
	public String gettitle(){
		return driver.getTitle();
	}
}
