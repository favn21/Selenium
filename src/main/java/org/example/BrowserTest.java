package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class BrowserTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\driver\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\driver\\msedgedriver.exe");


        String chromeUrl = "http://www.google.com";
        String firefoxUrl = "http://www.mozilla.org";
        String edgeUrl = "https://www.bing.com";


        WebDriver chromeDriver = new ChromeDriver();
        testBrowser(chromeDriver, chromeUrl);


        WebDriver firefoxDriver = new FirefoxDriver();
        testBrowser(firefoxDriver, firefoxUrl);


        WebDriver edgeDriver = new EdgeDriver();
        testBrowser(edgeDriver, edgeUrl);
    }

    public static void testBrowser(WebDriver driver, String url) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);
        Thread.sleep(5000);
        driver.quit();
    }
}