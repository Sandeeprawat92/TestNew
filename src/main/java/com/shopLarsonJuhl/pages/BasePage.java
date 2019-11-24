package com.shopLarsonJuhl.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

	/*
	 * @author : sandeep Rawat
	 * 
	 * @Date : 23-Nov-2019
	 * 
	 * @project_name : com.shopLarsonJuhl
	 * 
	 * @year: 2019
	 */
	private static final String Website_URL = "https://mcstg-shop.larsonjuhl.com/en-US/";
	private static final String WEBSITE_LOGO = ".logo";
	private static final String SEARCH_fIELD = "#search";
	private static final String PROFILE_IMAGE = ".profile_img";

	private static final String CART_ICON = "//I[@class='icon-shopping-cart icon']";

	private static final String SUPPORT_LINK = "//a[contains(text(),'Support')]";
	private static final String COUNTRY_ICON = "//span[@class='country-icon icon']";

	private static final String VIEW_CART = "//span[contains(text(),'View Cart')]";

	/* return user to the home page */

	public LoginPage navigateToTheWebsite() {
		openUrl(Website_URL);
		return this.switchToPage(LoginPage.class);
	}

	public HomePage clickOnLJLogo() {

		waitFor(WEBSITE_LOGO).$(WEBSITE_LOGO).click();

		return this.switchToPage(HomePage.class);
	}

	/* redirects user to the search Result page */

	public SearchResultPage enterSearchText(String searchText) {
		waitFor(SEARCH_fIELD).$(SEARCH_fIELD).typeAndEnter(searchText);
		return this.switchToPage(SearchResultPage.class);

	}

	public ContactUsPage clickOnSupportLink() {
		waitFor(SUPPORT_LINK).$(SUPPORT_LINK).click();
		return this.switchToPage(ContactUsPage.class);

	}

	public CartPage hoverOnCartIcon() {
		waitFor(CART_ICON);
		withAction().moveToElement($(CART_ICON)).build().perform();
		waitFor(VIEW_CART);
		$(VIEW_CART).click();

		return this.switchToPage(CartPage.class);

	}

}
