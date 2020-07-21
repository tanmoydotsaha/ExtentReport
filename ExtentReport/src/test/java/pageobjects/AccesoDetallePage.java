package pageobjects;

import Support.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccesoDetallePage extends Util {

    public static String numeroid;

    @FindBy(className = "button")
    private WebElement btnHome;

    @FindBy(xpath = "//table[@class='alt access']//h3[1]")
    private WebElement valorid;


    public AccesoDetallePage() {
        PageFactory.initElements(driver, this);
    }


    public void obtenerCustomerId() {
        wait.until(ExpectedConditions.visibilityOf(valorid));
        valorid.getText();
        numeroid = valorid.getText();
        System.out.println(numeroid);
    }


    public void clickHome() {
        btnHome.click();
    }

}
