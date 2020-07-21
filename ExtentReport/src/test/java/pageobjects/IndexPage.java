package pageobjects;

import Support.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IndexPage extends Util {

    @FindBy(xpath = "(//a[@href='addcustomer.php'])[1]")
    private WebElement lnkCustomer;


    @FindBy(xpath = "(//a[@href='assigntariffplantocustomer.php'])[1]")
    private WebElement lnkPlanCustomer;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickCustomer() {
        wait.until(ExpectedConditions.elementToBeClickable(lnkCustomer));
        lnkCustomer.click();
    }

    public void clickPlanCustomer(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkPlanCustomer));
        lnkPlanCustomer.click();
    }

}
