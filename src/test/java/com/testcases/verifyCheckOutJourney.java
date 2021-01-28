package com.testcases;

import com.pages.HomePage;

import org.testng.annotations.Test;

public class verifyCheckOutJourney extends BaseTest{


	private HomePage homepage;

	
	@Test(description = "Verify guest user is able to successfully checkout the cart")
	public void verifyCheckOutJourneyE2E() {
		homepage =new HomePage();
		
	}
}
