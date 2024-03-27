package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.AccountPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountDefinitions {
    private AccountPage accountPage;

    public AccountDefinitions(){
        this.accountPage = new AccountPage(Hooks.getDriver());
    }

    @Then("deberia llevar a la pagina de la cuenta")
    public void deberiaLlevarALaPaginaDeLaCuenta() {
        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.textIsDisplayed());
    }
}
