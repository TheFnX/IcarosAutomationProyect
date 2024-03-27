package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.MyAccountPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountDefinitions {

    private MyAccountPage myAccountPage;

    public MyAccountDefinitions(){
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }
    @Then("el usuario navega a la pagina de su cuenta")
    public void elUsuarioNavegaALaPaginaDeSuCuenta() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }
}
