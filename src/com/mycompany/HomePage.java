package com.mycompany;

public class HomePage extends BaseCls {
	// Method to perform actions on the homepage
	public void performHomePageActions() throws InterruptedException {
		// Example actions, you can add more as needed
		navigateToBaseUrl();
		// Perform other actions on the homepage
	}

	public static void main(String[] args) throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.performHomePageActions();
		homePage.tearDown();
	}
}  
