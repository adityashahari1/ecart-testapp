package com.solera.mystore.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class IndexPage extends Base {
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]")
	
	WebElement navToSignIn;

	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage clickOnSignInBtn() throws Throwable{
		Action.click(driver,navToSignIn);
//		Action.click(driver, signInBtn);
		return new SignInPage();		
	}
}