package pageobjects;

import Support.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AgregarPlanTarifaCustomerPage extends Util {

    @FindBy(id = "customer_id")
    private WebElement txtCustomerId;

    @FindBy(name = "submit")
    private WebElement btnSubmit;


    public AgregarPlanTarifaCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    public void ingresarCustomerId() {
        wait.until(ExpectedConditions.visibilityOf(txtCustomerId));
        txtCustomerId.sendKeys(AccesoDetallePage.numeroid);
    }

    public void clickSubmit() {
        btnSubmit.click();
    }

}
