package com.opencart.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritesPage extends BasePage {

    private By btnCameras =  By.xpath("//a[text()='Cameras']");
    private By btnAddFavorite = By.xpath("//div[./div/h4/a[text()='Canon EOS 5D']]/div/button[@data-original-title='Add to Wish List']");

    private By btnWishList = By.id("wishlist-total");

    private By txtCannonCamera = By.xpath("//td[normalize-space()='Product 3']");
    public FavoritesPage(WebDriver driver){
        super(driver);
    }


    public void clickToCamerasSection(){
        click(btnCameras);
    }
    public void addProductToFavorites(){
        click(btnAddFavorite);
    }
    public void clickToWishList(){
        click(btnWishList);
    }
    public boolean cameraInFavIsDisplayed(){
        return isDisplayed(txtCannonCamera);
    }
}
