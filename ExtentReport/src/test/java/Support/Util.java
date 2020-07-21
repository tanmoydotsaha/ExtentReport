package Support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.Hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class Util extends Hooks {

    public static WebDriverWait wait;

    public Util() {
        wait = new WebDriverWait(driver, 30);
    }

        public static void Screenshots() throws IOException {
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmss");
            String path = "test-output";
            String nombre = formato.format(fecha) + "_screenshot.jpg";
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(path + nombre));
        }

    public static boolean scrollToElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
