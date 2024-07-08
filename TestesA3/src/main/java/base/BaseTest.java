package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public String driverPath;
    public String url;
    public WebDriver driver;

    @BeforeClass
    public void preCond() {
        //driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe";
        url = System.getProperty("user.dir") + "\\src\\main\\resources\\iniciar.html";
       // System.setProperty("webdriver.gecko.driver", driverPath);
       // driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
