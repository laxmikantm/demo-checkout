package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.sl.In;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.*;
import org.junit.Assert;
import pageObjects.*;

import java.sql.Savepoint;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**************************
 *  (C) L Somni            *
 ***************************/

public class StepDefs {
    TestContext testContext;
    HomePage homePage;
    CheckOutSummaryPage checkOutSummaryPage;

    public StepDefs(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        checkOutSummaryPage = testContext.getPageObjectManager().getCheckOutSummaryPage();
    }

    @Given("^user is on the Home Page$")
    public void userIsOnHomePage() {
        homePage.navigateToHomePage();
    }


    @When("I select Starry Night portait with")
    public void iSelectStarryNightPortaitWith(final DataTable dataTable) throws Exception {
        List<Map<String, String>> productData = dataTable.asMaps(String.class, String.class);
        final int qty = Integer.parseInt(productData.get(0).get("Qty"));
        final String format = productData.get(0).get("Format");
        homePage.selectProduct(qty, format);
    }

    @And("I checkout")
    public void iCheckout() {
        homePage.checkOut();
    }

    @Then("Order summary page should be displayed with")
    public void orderSummaryPageShouldBeDisplayedWith(final DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> productData = dataTable.asMaps(String.class, String.class);
        final String totalPrice = productData.get(0).get("Total Price");
        System.out.println("actual amount->"+ checkOutSummaryPage.getTotalAmount());

        Assert.assertThat( checkOutSummaryPage.getTotalAmount(), is(equalTo(totalPrice)));
    }
}
