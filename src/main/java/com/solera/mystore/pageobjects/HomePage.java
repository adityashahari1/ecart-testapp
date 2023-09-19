package com.solera.mystore.pageobjects;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
	WebElement searchBar;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")
	WebElement searchSubmitBtn;
	
	@FindBy(xpath="//*[@id=\"products\"]/div[3]/div[1]/div/div[2]/a/div/div[1]/div[1]/img")
	WebElement firstProduct;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[3]/div/div[3]/div/div[6]/div[2]/div/div/div[4]/div")
	WebElement selectSize;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div")
	WebElement addToCart;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct() throws Throwable {
		Action.type(searchBar, "Shoes");
		Action.Wait(driver, 5);
		Action.click(driver, searchSubmitBtn);
	}
	
	public AddToCartPage SelectFirstProduct() throws Exception {
		  Action.click(driver, firstProduct);
	      Action.Wait(driver, 5);
	      

	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("tab switched");
	      Action.Wait(driver, 5);	  
	      Action.click(driver, addToCart);	
	      Action.Wait(driver, 5);
	      Action.click(driver, selectSize);
	      Action.Wait(driver, 5);
	      Action.click(driver, addToCart);	
	      
	      return new AddToCartPage();
	}
}
