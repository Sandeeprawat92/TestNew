package com.shopLarsonJuhl.cucumber.steps;

import com.shopLarsonJuhl.cucumber.steps.serenity.ShopLjSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
	/*
	 * @author : sandeep Rawat
	 * 
	 * @Date : 24-Nov-2019 com.shopLarsonJuhl 2019
	 */

	@Steps
	ShopLjSteps userSteps;

	@Given("^Open the website shoplarsonjuhl.com$")
	public void Open_the_website_shoplarsonjuhl_com() {
		userSteps.navigateToTheWebsite();
	}

}
