package com.solera.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class SignInPage extends Base{
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")
	WebElement emailTextbox;
	
	public SignInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname) throws Throwable{
		Action.type(emailTextbox, uname);
//		Action.click(driver, requestOtp);
		Thread.sleep(10000);
		

		return new HomePage();
	}

}
