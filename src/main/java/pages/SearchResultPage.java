package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static pages.constants.Constants.SearchItems.ELEMENTS_ON_THE_PAGE;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//li[@data-testid='product-grids']")
    private List<WebElement> searchResultList;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchResultListVisible(){
        int numberOfWebElements = searchResultList.size();
        if(numberOfWebElements == ELEMENTS_ON_THE_PAGE){
            return true;
        }else
            return false;
    }
}
