package com.opencart.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    private By inputBy = By.xpath("//input[@name='search']");
    private By carrouselBy = By.id("slideshow0");
    private By menuBy = By.id("menu");
    private By myAccountBy = By.xpath("//li/a[@title='My Account']");
    private By loginBy = By.xpath("//a[text()='Login']");
    private By registerBy = By.xpath("//a[text()='Register']");

    public HomePage(WebDriver driver){
    super(driver);
    }
    public boolean inputIsDisplayed(){
        return isDisplayed(inputBy);
    }
    public boolean carrouselIsDisplayed(){
        return isDisplayed(carrouselBy);
    }
    public boolean menuIsDisplayed(){
        return isDisplayed(menuBy);
    }
    public boolean myAccountIsDisplayed(){
        return isDisplayed(myAccountBy);
    }
    public void clickMyAccount(){
        click(myAccountBy);
    }
    public void clickLoginInDropdown(){
        click(loginBy);
    }
    public void clickRegisterInDropdown(){
        click(registerBy);
    }
}
