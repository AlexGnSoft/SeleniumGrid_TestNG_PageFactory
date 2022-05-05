package utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        return chromeOptions;
    }

    public static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();  //used for geolocation set up and prompts management
        firefoxOptions.setCapability(FirefoxDriver.PROFILE, profile);
        profile.setAcceptUntrustedCertificates(true);
        profile.setAcceptUntrustedCertificates(false);
        profile.setPreference("geo.enabled", true);
        profile.setPreference("geo.prompt.testing", true);
        profile.setPreference("geo.prompt.testing.allow", true);
        return firefoxOptions;
    }
}
