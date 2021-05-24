package Helper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import javax.imageio.ImageIO;

/**************************
 *  (C) L Somni            *
 ***************************/

public class helper {

	public static String TOTAL_PRICE;

    public static FluentWait<WebDriver> fluentWait(WebDriver driver) {
        return new FluentWait<WebDriver>(driver)
                .withTimeout(50, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(NotFoundException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(TimeoutException.class);
    }

}
