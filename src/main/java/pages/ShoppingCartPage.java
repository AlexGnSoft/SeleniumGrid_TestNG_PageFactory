package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//h1[@class='nl-categoryMasthead-banner__title']")
    private WebElement shoppingCartTitle;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
}
