import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.HomePage;
import utils.CapabilityFactory;
import java.net.MalformedURLException;
import java.net.URL;
import static pages.constants.Constants.Urls.WEB_SITE_HUB;
import static pages.constants.Constants.Urls.WEB_SITE_URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox")String browser) throws MalformedURLException{

        driver.set(new RemoteWebDriver(new URL(WEB_SITE_HUB), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(WEB_SITE_URL);
    }

    @AfterMethod
    public void tearDown(){
        getDriver().close();
    }

    @AfterClass
    void terminate(){
        driver.remove();
    }

    public WebDriver getDriver(){
        return driver.get();
    }
    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }
}
