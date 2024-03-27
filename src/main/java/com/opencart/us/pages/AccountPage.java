package com.opencart.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{

    private By titleBy = By.xpath("//h1[text()='Account']");

    private By textBy = By.xpath("//p[contains(text(),'Your new account')]");


    public AccountPage(WebDriver driver){
        super(driver);
    }

    public boolean titleIsDisplayed(){
        return isDisplayed(titleBy);
    }
    public boolean textIsDisplayed() {
        return super.isDisplayed(textBy);
    }
}
