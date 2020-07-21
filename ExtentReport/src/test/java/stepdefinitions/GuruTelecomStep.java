package stepdefinitions;

import Support.Util;
<<<<<<< HEAD
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GuruTelecomStep {

    IndexPage indexPage;
    AgregarCustomerPage agregarCustomerPage;
    AccesoDetallePage accesoDetallePage;
    AgregarPlanTarifaCustomerPage agregarPlanTarifaCustomerPage;
    AprobarPlanTarifaCustomerPage aprobarPlanTarifaCustomerPage;

    public GuruTelecomStep() {
        indexPage = new IndexPage();
        agregarCustomerPage = new AgregarCustomerPage();
        accesoDetallePage = new AccesoDetallePage();
        agregarPlanTarifaCustomerPage = new AgregarPlanTarifaCustomerPage();
        aprobarPlanTarifaCustomerPage = new AprobarPlanTarifaCustomerPage();
    }
    

    @Given("accedo a la pagina web de Guru")
    public void accedoALaPaginaWebDeGuru() {
        Hooks.driver.get("http://demo.guru99.com/telecom/index.html");
    }

    @When("selecciono Add customer")
    public void seleccionoAddCustomer() throws IOException {
        indexPage.clickCustomer();
    }

    @And("selecciono el tipo de antecedente {string}")
    public void seleccionoElTipoDeAntecedente(String background) throws IOException {
        agregarCustomerPage.seleccionarBackground(background);
    }

    @And("ingreso mi nombre {string} y apellido {string}")
    public void ingresoMiNombreYApellido(String nombre, String apellido) throws IOException {
        agregarCustomerPage.ingresarNombre(nombre);
        agregarCustomerPage.ingresarApellido(apellido);
    }

    @And("ingreso mi email {string} y mi direccion {string}")
    public void ingresoMiEmailYMiDireccion(String email, String direccion) throws IOException {
        agregarCustomerPage.ingresarEmailDireccion(email, direccion);
    }

    @And("finalmente ingreso mi numero de celular {string} y envío")
    public void finalmenteIngresoMiNumeroDeCelularYEnvío(String celular) throws IOException {
        agregarCustomerPage.ingresoCelular(celular);
        agregarCustomerPage.clickSubmit();

    }

    @And("se genera un customer id el cual sera guardado y regresamos a Home")
    public void seGeneraUnCustomerIdElCualSeraGuardadoYRegresamosAHome() throws IOException {
        accesoDetallePage.obtenerCustomerId();
        accesoDetallePage.clickHome();
    }

    @And("ingreso a Add Tariff Plan to Customer e ingreso el customer id generado para ser enviado")
    public void ingresoAAddTariffPlanToCustomerEIngresoElCustomerIdGeneradoParaSerEnviado() throws IOException {
        indexPage.clickPlanCustomer();
        agregarPlanTarifaCustomerPage.ingresarCustomerId();
        agregarPlanTarifaCustomerPage.clickSubmit();
    }

    @And("valido el mensaje con efecto agrego el Tariff Plan to Customer")
    public void validoElMensajeConEfectoAgregoElTariffPlanToCustomer() throws IOException {
        aprobarPlanTarifaCustomerPage.clickAddPlanTarif();
    }

    @Then("nos mostrara un mensaje de exito {string}")
    public void nosMostraraUnMensajeDeExito(String mensaje) throws IOException {
        aprobarPlanTarifaCustomerPage.validarMensajeExitoso(mensaje);
=======
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;

import java.io.IOException;

public class GuruTelecomStep {

    IndexPage indexPage;
    AgregarCustomerPage agregarCustomerPage;
    AccesoDetallePage accesoDetallePage;
    AgregarPlanTarifaCustomerPage agregarPlanTarifaCustomerPage;
    AprobarPlanTarifaCustomerPage aprobarPlanTarifaCustomerPage;

    public GuruTelecomStep() {
        indexPage = new IndexPage();
        agregarCustomerPage = new AgregarCustomerPage();
        accesoDetallePage = new AccesoDetallePage();
        agregarPlanTarifaCustomerPage = new AgregarPlanTarifaCustomerPage();
        aprobarPlanTarifaCustomerPage = new AprobarPlanTarifaCustomerPage();
    }

    @Given("accedo a la pagina web de Guru")
    public void accedoALaPaginaWebDeGuru() {
        Hooks.driver.get("http://demo.guru99.com/telecom/index.html");
    }

    @When("selecciono Add customer")
    public void seleccionoAddCustomer() throws IOException {
        indexPage.clickCustomer();
        Util.Screenshots();
    }

    @And("selecciono el tipo de antecedente {string}")
    public void seleccionoElTipoDeAntecedente(String background) throws IOException {
        agregarCustomerPage.seleccionarBackground(background);
    }

    @And("ingreso mi nombre {string} y apellido {string}")
    public void ingresoMiNombreYApellido(String nombre, String apellido) throws IOException {
        agregarCustomerPage.ingresarNombre(nombre);
        agregarCustomerPage.ingresarApellido(apellido);
    }

    @And("ingreso mi email {string} y mi direccion {string}")
    public void ingresoMiEmailYMiDireccion(String email, String direccion) throws IOException {
        agregarCustomerPage.ingresarEmailDireccion(email, direccion);
    }

    @And("finalmente ingreso mi numero de celular {string} y envío")
    public void finalmenteIngresoMiNumeroDeCelularYEnvío(String celular) throws IOException {
        agregarCustomerPage.ingresoCelular(celular);
        Util.Screenshots();
        agregarCustomerPage.clickSubmit();

    }

    @And("se genera un customer id el cual sera guardado y regresamos a Home")
    public void seGeneraUnCustomerIdElCualSeraGuardadoYRegresamosAHome() throws IOException {
        accesoDetallePage.obtenerCustomerId();
        accesoDetallePage.clickHome();
        Util.Screenshots();
    }

    @And("ingreso a Add Tariff Plan to Customer e ingreso el customer id generado para ser enviado")
    public void ingresoAAddTariffPlanToCustomerEIngresoElCustomerIdGeneradoParaSerEnviado() throws IOException {
        indexPage.clickPlanCustomer();
        agregarPlanTarifaCustomerPage.ingresarCustomerId();
        Util.Screenshots();
        agregarPlanTarifaCustomerPage.clickSubmit();
        Util.Screenshots();
    }

    @And("valido el mensaje con efecto agrego el Tariff Plan to Customer")
    public void validoElMensajeConEfectoAgregoElTariffPlanToCustomer() throws IOException {
        aprobarPlanTarifaCustomerPage.clickAddPlanTarif();
        Util.Screenshots();
    }

    @Then("nos mostrara un mensaje de exito {string}")
    public void nosMostraraUnMensajeDeExito(String mensaje) throws IOException {
        aprobarPlanTarifaCustomerPage.validarMensajeExitoso(mensaje);
        Util.Screenshots();
>>>>>>> branch 'master' of https://github.com/grasshopper7/ExtentReport
    }
}
