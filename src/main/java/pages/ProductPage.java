package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//button[@data-testid='add-to-cart'][text()='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='nl-cart-flyout__container']")
    private WebElement addToCartPopupFrame;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//button[text()='Continue to Cart']")
    private WebElement continueToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
    }

    public WebElement getAddToCartButton(){
        return addToCartButton;
    }

    public boolean isAddToCartPopupVisible(){
        return addToCartPopupFrame.isDisplayed();
    }

    public void isContinueShoppingButtonVisible(){
        continueShoppingButton.isDisplayed();
    }

    public String getAddToCartPopupText(){
        return addToCartPopupFrame.getText();
    }

    public void isContinueToCartButton(){
        continueToCartButton.isDisplayed();
    }

    public void clickContinueToCartButton(){
        continueToCartButton.click();
    }

    public WebElement getAddToCartPopupFrame(){
        return addToCartPopupFrame;
    }
}


