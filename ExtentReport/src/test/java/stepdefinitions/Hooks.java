package stepdefinitions;

import io.cucumber.java.After;
<<<<<<< HEAD
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Hooks {
    private static String navegador = "chrome";
    public static WebDriver driver;

    @Before
    public void setUp() throws IOException {
        if (navegador.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (navegador.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }


    @After
    public void TearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    
    @AfterStep
    public void screenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) Hooks.driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "");
		/*
		 * try { Thread.sleep(2500); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
=======
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Hooks {
    private static String navegador = "chrome";
    public static WebDriver driver;
    private Scenario scenario;

    @Before
    public void setUp() throws IOException {
        if (navegador.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (navegador.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }


    @After
    public void TearDown(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "");
        driver.manage().deleteAllCookies();
        driver.close();
>>>>>>> branch 'master' of https://github.com/grasshopper7/ExtentReport
    }
}