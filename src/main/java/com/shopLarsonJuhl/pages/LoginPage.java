package com.shopLarsonJuhl.pages;

public class LoginPage extends BasePage {
	/*
	 * @author : sandeep Rawat
	 * 
	 * @Date : 23-Nov-2019 com.shopLarsonJuhl 2019
	 */

	private static final String EMAIL_FIELD = "#email";

	private static final String PASSWORD_FIELD = "#pass";
	private static final String SIGN_IN_BUTTON = "#send2";

	private static final String INVALID_MESSAGE = "// p[@class='login-error-msg messageerror']";

	/* login to the website */

	public HomePage LoginToTheWebsite(String emailid, String password) {

		waitForTextToAppear("Current Customers");
		$(EMAIL_FIELD).click();
		$(EMAIL_FIELD).sendKeys(emailid);
		$(PASSWORD_FIELD).click();
		$(PASSWORD_FIELD).sendKeys(password);
		$(SIGN_IN_BUTTON).click();
		return this.switchToPage(HomePage.class);
	}

	public String getMessageOnInvalidLogin() {
		return waitForTextToAppear("Invalid email or password.").$(INVALID_MESSAGE).getText();
	}

}
