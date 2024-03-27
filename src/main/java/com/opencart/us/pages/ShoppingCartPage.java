package com.opencart.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{

    private By btnCamera = By.xpath("//a[text()='Cameras']");
    private By clickCannonCamera = By.xpath("//div[@class='image']//img[@title='Canon EOS 5D']");
    private By clickOptionSelect = By.xpath("//select[@id='input-option226']/option[contains(text(),'Red')]");
    private By btnAddCart = By.xpath("//button[@id='button-cart']");
    private By btnViewShoppingCart = By.xpath("//a[@title='Shopping Cart'] ");
    private By titleProduct = By.xpath("(//td[normalize-space()='Product 3']");

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    public void clickToCameraButton(){
        click(btnCamera);
    }
    public void selectProduct(){
        click(clickCannonCamera);
    }
    public void selectColorProduct(){
        click(clickOptionSelect);
    }
    public void clickAddCartButton(){
        click(btnAddCart);
    }
    public void clickShoppingCartButton(){
        click(btnViewShoppingCart);
    }

    public boolean cameraIsDisplayed(){
        return isDisplayed(titleProduct);
    }
}
