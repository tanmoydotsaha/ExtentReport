package pageobjects;

import Support.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AgregarCustomerPage extends Util {

    public static String nombre;

    @FindBy(xpath = "//label[@for='done']")
    private WebElement rdbDone;

    @FindBy(xpath = "//label[@for='pending']")
    private WebElement rdbPending;

    @FindBy(id = "fname")
    private WebElement txtFirstName;

    @FindBy(id = "lname")
    private WebElement txtLastName;

    @FindBy(id = "email")
    private WebElement txtEmail;

    @FindBy(name = "addr")
    private WebElement txtAddress;

    @FindBy(id = "telephoneno")
    private WebElement txtTelefono;

    @FindBy(name = "submit")
    private WebElement btnSubmit;

    public AgregarCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    public void seleccionarBackground(String background) {
        wait.until(ExpectedConditions.elementToBeClickable(rdbDone));
        Util.scrollToElement(btnSubmit);
        if (background.equalsIgnoreCase("Done")) {
            rdbDone.click();
        } else if (background.equalsIgnoreCase("Pending")) {
            rdbPending.click();
        }
    }

    public void ingresarNombre(String nombre) {
        txtFirstName.sendKeys(nombre);
    }

    public void ingresarApellido(String apellido) {
        txtLastName.sendKeys(apellido);
    }

    public void ingresarEmailDireccion(String email, String direccion) {
        txtEmail.sendKeys(email);
        txtAddress.sendKeys(direccion);
    }

    public void ingresoCelular(String celular) {
        txtTelefono.sendKeys(celular);
    }

    public void clickSubmit() {
        btnSubmit.click();
    }
}