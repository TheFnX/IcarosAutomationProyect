package stepDefinitions;

import com.github.javafaker.Faker;
import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.HomePage;
import com.opencart.us.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterDefinitions {
    private HomePage homePage;
    private RegisterPage registerPage;
    Faker faker = new Faker();

    public RegisterDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
    }
    @Given("el usuario navega a registro")
    public void elUsuarioNavegaARegistro() {
        Hooks.getDriver().get(Hooks.getProperty("url"));
        homePage.clickMyAccount();
        homePage.clickRegisterInDropdown();
    }

    @When("completa el formulario con sus datos")
    public void completaElFormularioConSusDatos() {
        registerPage.completeForm(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.phoneNumber().cellPhone(), faker.internet().password());
    }

    @When("deja los campos obligatorio vacios")
    public void dejaLosCamposObligatorioVacios() {
        registerPage.completeForm("",faker.name().lastName(), faker.internet().emailAddress(), faker.phoneNumber().cellPhone(), faker.internet().password());

    }

    @Then("deberia ver un mensaje de error")
    public void deberiaVerUnMensajeDeError() {
        Assert.assertTrue(registerPage.txtErrorIsDisplayed());
    }
}
