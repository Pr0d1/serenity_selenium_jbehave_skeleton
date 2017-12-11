package skeleton.features.steps;

import skeleton.features.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import skeleton.utils.Utils;

public class SearchDefinitions {

    @Steps
    SearchSteps searchSteps;

    @Given("User searchs for <searchWord>")
    public void givenUserSearchsFor(String searchWord) {

        searchSteps.open();
        searchSteps.connect(searchWord);
    }




}
