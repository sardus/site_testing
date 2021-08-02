package ru.midpassTestzpsite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sardu\\Documents\\ChromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "C:\\Users\\sardu\\Documents\\AutoTestsLogs\\slog.log");
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
