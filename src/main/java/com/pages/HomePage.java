package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

	@FindBy(xpath="//div[@class='header-container']")
	private WebElement header;
	
	
	public void isHeaderDisplayed(){
		isVisible(header);
	}

	
}
