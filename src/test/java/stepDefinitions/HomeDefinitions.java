package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;
    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }
    @Given("que el usuario ingresa a la pagina de inicio")
    public void queElUsuarioIngresaALaPaginaDeInicio(){
        Hooks.getDriver().get(Hooks.getProperty("url"));
    }

    @Then("se valida que se muestre correctamente")
    public void seValidaQueSeMuestreCorrectamente() {
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }
}
