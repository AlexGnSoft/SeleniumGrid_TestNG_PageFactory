package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header[contains(@class,'dynamicexperiencefragment experiencefragment')]")
    private WebElement header;

    @FindBy(xpath = "//footer[contains(@class,'experiencefragment aem-GridColumn')]")
    private WebElement footer;

    @FindBy(xpath = "//a[@class='nl-footer-social-share__icon']")
    private WebElement socialMediaIcons;

    @FindBy(xpath = "//div[@class='nl-cart']/a[@href='/en/shopping-cart.html']")
    private WebElement cartIcon;

    @FindBy(xpath = "//div[@class='kampyle_button-text'][text()='Feedback']")
    private WebElement feedbackButton;

    @FindBy(xpath = "//button[@data-link-value='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='nl-pencil-banner__authentication--register']")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@class='gigya-screen-dialog-main']")
    private WebElement signInPopup;

    @FindBy(xpath = "//span[text()='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//span[text()='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='gigya-screen-dialog-close']")
    private WebElement signInPopupCloseButton;

    @FindBy(xpath = "//button[text()='Automotive']")
    private WebElement automotiveStoreButton;

    @FindBy(xpath = "//input[@id='search-input']")
    private WebElement searchField;

    @FindBy(xpath = "//span[@class='nl-wishlist-badge']")
    private WebElement wishListIcon;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void isHeaderVisible(){
        header.isDisplayed();
    }
    public void isFooterVisible(){
        footer.isDisplayed();
    }
    public void isSocialMediaVisible(){
        socialMediaIcons.isDisplayed();
    }
    public void isCartIconVisible(){
        cartIcon.isDisplayed();
    }
    public void isSearchFieldVisible(){
        searchField.isDisplayed();
    }
    public String getFeedbackButtonText(){
        return feedbackButton.getText();
    }
    public void clickAutomotiveStoreButton(){
        automotiveStoreButton.isDisplayed();
    }

    public void enterTextToSearchField(String searchedProduct){
        searchField.clear();
        searchField.sendKeys(searchedProduct);
    }

    public void clickCartButton(){
        cartIcon.click();
    }

    public int getAmountOfProductInWishList(){
        int wishProducts = Integer.parseInt(wishListIcon.getText());
        return wishProducts;
    }

    public WebElement getFeedbackButton(){
        return feedbackButton;
    }
}
