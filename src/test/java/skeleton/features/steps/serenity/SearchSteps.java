package skeleton.features.steps.serenity;

import skeleton.page.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {

    SearchPage searchPage;

    @Step
    public void open() {

        searchPage.open();
    }//comment
    @Step
    public void connect(String searchWord ) {

        searchPage.search(searchWord);
    }

}
