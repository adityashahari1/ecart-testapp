package com.solera.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class AddToCartPage extends Base{
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/a/div")
	WebElement goToBag;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	

}
