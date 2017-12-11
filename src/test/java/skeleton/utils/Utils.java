package skeleton.utils;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    /**
     * This makes the driver waits for an elements to be visible.
     *
     * @param  driver  The WebDriver used in the current Thread.
     * @param  currentPage The current page (in most cases : this).
     * @param  id   The id of the element we need to wait for.
     * @param  timeout  max wait time.
     */
    public static void waitForElementVisibilityByID(WebDriver driver, PageObject currentPage, String id, int timeout ){

        WebElement x = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        // Hint : This is good to wait for the presence of an element
        currentPage.waitForRenderedElements(By.id(id));
    }

    /**
     * This makes the driver waits for an elements to be visible.
     *
     * @param  driver  The WebDriver used in the current Thread.
     * @param  currentPage The current page (in most cases : this).
     * @param  xpath   The xpath of the element we need to wait for.
     * @param  timeout  max wait time.
     */
    public static void waitForElementVisibilityByXPath(WebDriver driver, PageObject currentPage, String xpath, int timeout ){

        WebElement x = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        // Hint : This is good to wait for the presence of an element
        currentPage.waitForRenderedElements(By.xpath(xpath));
    } //test commit Pierre
}
