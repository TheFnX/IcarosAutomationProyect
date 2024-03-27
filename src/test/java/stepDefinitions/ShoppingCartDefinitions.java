package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ShoppingCartDefinitions {
    private ShoppingCartPage shoppingCartPage;
    public ShoppingCartDefinitions(){
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
    }

    @When("se agrega un producto a carrito")
    public void seAgregaUnProductoACarrito() {
        shoppingCartPage.clickToCameraButton();
        shoppingCartPage.selectProduct();
        shoppingCartPage.selectColorProduct();
        shoppingCartPage.clickAddCartButton();
        shoppingCartPage.clickShoppingCartButton();
    }

    @Then("se valida que el producto se agregado")
    public void seValidaQueElProductoSeAgregado() {
        Assert.assertTrue(shoppingCartPage.cameraIsDisplayed());
    }
}
