package pageobjects;

import Support.Util;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AprobarPlanTarifaCustomerPage extends Util {




    @FindBy(tagName = "h3")
    private WebElement msjEfecto;

    @FindBy(name = "submit")
    private WebElement btnAddPlanTarif;

    @FindBy(tagName = "h2")
    private WebElement lblMensaje;

    public AprobarPlanTarifaCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarMensajeEfecto(){

        /*Assert.assertEquals(AgregarCustomerPage.ingresar,msjEfecto.getText());*/

    }


    public void clickAddPlanTarif() {
        btnAddPlanTarif.click();
    }

    public void validarMensajeExitoso(String mensaje) {
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertEquals(mensaje, lblMensaje.getText());

    }


}
