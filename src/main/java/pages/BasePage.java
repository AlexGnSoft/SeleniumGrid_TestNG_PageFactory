package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static pages.constants.Constants.TimeoutVariables.EXPLICITY_WAIT;
import static pages.constants.Constants.TimeoutVariables.IMPLICITY_WAIT;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoadComplete() {
        new WebDriverWait(driver, EXPLICITY_WAIT).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForAjaxToComplete(){
        new WebDriverWait(driver, EXPLICITY_WAIT).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return window.jQuery != undefined && jQuery.active == 0;"));
    }

    public void waitVisibilityOfElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, EXPLICITY_WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitImplicity(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);
    }
}
