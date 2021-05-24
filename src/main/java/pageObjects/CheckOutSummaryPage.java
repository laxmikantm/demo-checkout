package pageObjects;

import Helper.helper;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**************************
 *  (C) L Somni            *
 ***************************/

public class CheckOutSummaryPage extends BasePage {


    public CheckOutSummaryPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.CSS, using = ".snipcart-summary-fees span[class*=snipcart-summary-fees__amount]")
    private WebElement totalAmount;

    public String getTotalAmount() throws InterruptedException {
        Thread.sleep(800);
        driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
        //TODO - To remove above Thread.sleep & use better waiting strategy
        return totalAmount.getText();
    }

}
