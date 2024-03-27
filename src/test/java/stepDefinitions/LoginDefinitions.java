package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.HomePage;
import com.opencart.us.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;

    public LoginDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
    }
    @Given("el usuario navega al login")
    public void elUsuarioNavegaAlSitioWeb() {
        Hooks.getDriver().get(Hooks.getProperty("url"));
        homePage.clickMyAccount();
        homePage.clickLoginInDropdown();
    }
    @When("el usuario ingresa credenciales validas")
    public void elUsuarioIngresaCredencialesValidas() {
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @When("el usuario ingresa credenciales invalidas")
    public void elUsuarioIngresaCredencialesInvalidas() {
        loginPage.login("username","123456123");
    }
    @Then("se muestra un mensaje de error")
    public void seMuestraUnMensajeDeError() {
        Assert.assertTrue(loginPage.warningIsDisplayed());
    }

    @And("el usuario se loguea en la aplicacion")
    public void elUsuarioSeLogueaEnLaAplicacion() {
        homePage.clickMyAccount();
        homePage.clickLoginInDropdown();
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }


}
