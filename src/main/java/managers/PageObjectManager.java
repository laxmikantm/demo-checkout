package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

/**************************
 *  (C) L Somni            *
 ***************************/


public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private CheckOutSummaryPage checkOutSummaryPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null)? homePage = new HomePage(driver): homePage;
	}

	public CheckOutSummaryPage getCheckOutSummaryPage() {
		return (checkOutSummaryPage == null)? checkOutSummaryPage = new CheckOutSummaryPage(driver): checkOutSummaryPage;
	}


}