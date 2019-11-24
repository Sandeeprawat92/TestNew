package com.shopLarsonJuhl.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.shopLarsonJuhl.cucumber.steps.serenity.ShopLjSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginTest {
	/*
	 * @author : sandeep Rawat
	 * 
	 * @Date : 24-Nov-2019 com.shopLarsonJuhl 2019
	 */

	@Managed
	WebDriver driver;

	@Steps
	ShopLjSteps userSteps;

	@Test
	@Title("Verify if a user can login succesfully to the shopLJstore with valid credentials")
	public void verifyIfLoginIsSuccessful() {
		userSteps.navigateToTheWebsite();
		userSteps.LoginToTheWebsite("rajeshthakur@sourcemash.com", "Test@123");

	}

	@Test
	@Title("Verify that user is able to search value from search field")
	public void VerifysearchFieldFunctionality() {
		userSteps.navigateToTheWebsite();
		userSteps.LoginToTheWebsite("rajeshthakur@sourcemash.com", "Test@123");
		userSteps.enterSearchText("154BL");
	}
}
