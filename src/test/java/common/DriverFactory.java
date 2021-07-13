package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {
    public static WebDriver createDriver(){
        String browser = System.getProperty("browser","chrome");
        if("chrome".equals(browser)){
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            return new ChromeDriver();
        }
        else if("firefox".equals(browser)){
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            return new FirefoxDriver();
        }
        throw new RuntimeException("Unsupported webdriver"+browser);
    }
}
