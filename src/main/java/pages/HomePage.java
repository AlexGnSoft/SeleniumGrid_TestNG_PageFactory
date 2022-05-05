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

    @FindBy(xpath = "//a[@class='nl-pencil-banner__language']")
    private WebElement languageButton;

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

    public void getLanguageButtonText(){
        languageButton.getText();
    }

    public void SignInButtonVisible(){
        signInButton.isDisplayed();
    }

    public void RegisterButtonVisible(){
        registerButton.isDisplayed();
    }

    public WebElement getSignInPopup(){
        return signInPopup;
    }

    public void isEmailVisible(){
        emailField.isDisplayed();
    }

    public void isPasswordVisible(){
        passwordField.isDisplayed();
    }

    public void clickSignInPopupButton(){
        signInPopupCloseButton.click();
    }

    public void clickAutomotiveStoreButton(){
        automotiveStoreButton.isDisplayed();
    }

    public void searchFieldVisible(){
        searchField.isDisplayed();
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
}
