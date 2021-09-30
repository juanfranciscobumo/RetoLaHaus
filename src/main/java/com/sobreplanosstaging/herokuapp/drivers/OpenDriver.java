package com.sobreplanosstaging.herokuapp.drivers;

import com.sobreplanosstaging.herokuapp.utils.enums.CapabilitiesEnum;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import static com.sobreplanosstaging.herokuapp.utils.enums.CapabilitiesEnum.*;
import static java.util.logging.Level.WARNING;
import static org.openqa.selenium.PageLoadStrategy.EAGER;
import static org.openqa.selenium.remote.CapabilityType.BROWSER_NAME;

public class OpenDriver implements DriverSource {

    private static ChromeOptions options = new ChromeOptions();
    private static FirefoxOptions firefoxOptions = new FirefoxOptions();
    private static Logger logger = Logger.getLogger(OpenDriver.class.getName());

    @Override
    public WebDriver newDriver() {
        try {
            switch (System.getProperty(DRIVER.getAtributo())) {
                case "firefox":
                    System.setProperty(CapabilitiesEnum.WEBDRIVER_GECKO_DRIVER.getAtributo(), RUTA_MOZILLA.getAtributo());
                    firefoxOptions.addArguments(CapabilitiesEnum.PRIVATE_MOZILLA.getAtributo());
                    return new FirefoxDriver(firefoxOptions);

                case "remote":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability(ACCEPT_INSECURE_CERTS.getAtributo(), true);
                    desiredCapabilities.setCapability(BROWSER_NAME, System.getProperty(REMOTE_DRIVER.getAtributo()));
                    return new RemoteWebDriver(new URL(URL_REMOTE.getAtributo()), desiredCapabilities);

                case "chrome":
                default:
                    options.addArguments(MAXIMIZE.getAtributo());
                    options.addArguments(PRIVATE_GOOGLE.getAtributo());
                    options.setPageLoadStrategy(EAGER);
                    System.setProperty(WEBDRIVER_CHROME_DRIVER.getAtributo(), RUTA_CHROME.getAtributo());
                    return new ChromeDriver(options);
            }
        } catch (NullPointerException | MalformedURLException e) {
            logger.log(WARNING, e.getMessage());
            options.addArguments(MAXIMIZE.getAtributo());
            options.addArguments(PRIVATE_GOOGLE.getAtributo());
            options.setPageLoadStrategy(EAGER);
            System.setProperty(WEBDRIVER_CHROME_DRIVER.getAtributo(), RUTA_CHROME.getAtributo());
            return new ChromeDriver(options);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

}
