package pageObjects;

import Helper.helper;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**************************
 *  (C) L Somni            *
 ***************************/

public class HomePage extends BasePage {

    public static final By STARRY_NIGHT_DROP_DOWN = By.xpath("//h2[contains(text(),'Starry Night')]/ancestor::div[@class='product']//select[@id='format']");
    public static String STARRY_NIGHT_PATH = "//h2[contains(text(),'Starry Night')]/ancestor::div[@class='product']";

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Starry Night')]/ancestor::div[@class='product']//input[@id='quantity']")
    private WebElement qty_field;

    @FindBy(how = How.CSS, using = "button[data-item-id='demo-starry-night-digital']")
    private WebElement add_to_cart_btn;

    @FindBy(how = How.CSS, using = ".snipcart-button-primary.snipcart-base-button.is-icon-right")
    private WebElement checkOutBtn;


    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void selectFormat(final String format) throws Exception {
        Select se = new Select(driver.findElement(STARRY_NIGHT_DROP_DOWN));
            switch (format.toLowerCase()){
                case "physical copy":
                    se.selectByValue("physical");
                    break;
                case "digital copy":
                    se.selectByValue("digital");
                    break;
                default:
                    throw new Exception("Invalid format provided");
            }

    }

    public void selectProduct(final int qty, final String format) throws Exception {

        qty_field.clear();
        qty_field.sendKeys(String.valueOf(qty));
        this.selectFormat(format);
        add_to_cart_btn.click();

    }


    public void checkOut() {
        helper.fluentWait(driver);
        checkOutBtn.click();
    }



}
