
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest{

    @Test
    public void checkMainComponentsVisibilityOnHomePage() {
        getHomePage().waitForPageLoadComplete();
        getHomePage().waitForAjaxToComplete();
        getHomePage().isHeaderVisible();
        getHomePage().isFooterVisible();
        getHomePage().isSocialMediaVisible();
        getHomePage().isCartIconVisible();
        getHomePage().isSearchFieldVisible();
        getHomePage().waitVisibilityOfElement(getHomePage().getFeedbackButton());
        assertTrue(getHomePage().getFeedbackButtonText().equalsIgnoreCase("Feedback"));
    }
}
