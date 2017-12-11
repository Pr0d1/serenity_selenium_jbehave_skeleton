package skeleton.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import skeleton.utils.Utils;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://google.fr")
public class SearchPage extends PageObject {

    @FindBy(id="lst-ib")
    private WebElement searchInput;


    public void search(String searchWord) {

        searchInput.sendKeys(searchWord);
        searchInput.sendKeys(Keys.RETURN);
        Utils.waitForElementVisibilityByID(getDriver(), this, "center_col", 10);
    }
}
