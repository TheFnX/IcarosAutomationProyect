package com.opencart.us.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By inputMailBy = By.id("input-email");
    private By inputPasswordBy = By.id("input-password");
    private By btnLoginBy = By.xpath("//input[@value='Login']");
    private By errorWarningBy = By.xpath("//div[contains(text(),'Warning:')]");


    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void setEmail(String email){
        sendKeys(inputMailBy, email);
    }
    public void setPassword(String password){
        sendKeys(inputPasswordBy, password);
    }
    public void clickLogin(){
        click(btnLoginBy);
    }
    public boolean warningIsDisplayed(){
        return isDisplayed(errorWarningBy);
    }
    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        clickLogin();
    }

}

