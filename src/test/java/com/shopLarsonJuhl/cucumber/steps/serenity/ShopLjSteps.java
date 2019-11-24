package com.shopLarsonJuhl.cucumber.steps.serenity;

import com.shopLarsonJuhl.pages.BasePage;
import com.shopLarsonJuhl.pages.HomePage;
import com.shopLarsonJuhl.pages.LoginPage;
import com.shopLarsonJuhl.pages.SearchResultPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ShopLjSteps extends ScenarioSteps {
	/*
	 * @author : sandeep Rawat
	 * 
	 * @Date : 24-Nov-2019 com.shopLarsonJuhl 2019
	 */
	BasePage basePage;
	LoginPage loginPage;

	/* base page steps */

	// @Step("Enter the url to the browser and press enter user redirects to
	// homepage")
	public LoginPage navigateToTheWebsite() {
		return basePage.navigateToTheWebsite();
	}

	// @Step("Enter the login details email id and password to the website")
	public HomePage LoginToTheWebsite(String email, String password) {
		return loginPage.LoginToTheWebsite(email, password);
	}

	// @Step("Enter the product sku to the search field and press enter button")
	public SearchResultPage enterSearchText(String value) {
		return basePage.enterSearchText(value);
	}

}
