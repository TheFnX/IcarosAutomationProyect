package stepDefinitions;

import com.opencart.us.hooks.Hooks;
import com.opencart.us.pages.FavoritesPage;
import com.opencart.us.pages.HomePage;
import com.opencart.us.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyFavoritesDefinitions {

    private FavoritesPage favoritePage;
    
    public MyFavoritesDefinitions(){

        this.favoritePage = new FavoritesPage(Hooks.getDriver());
    }
    @When("se agrega un producto a favoritos")
    public void seAgregaUnProductoAFavoritos() {
        favoritePage.clickToCamerasSection();
        favoritePage.addProductToFavorites();
        favoritePage.clickToWishList();
    }

    @Then("se valida que el producto sea agregado correctamente")
    public void seValidaQueElProductoSeaAgregadoCorrectamente() {
        Assert.assertTrue(favoritePage.cameraInFavIsDisplayed());
    }
}
