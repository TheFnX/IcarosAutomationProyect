package com.opencart.us.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    private By inputFirstName = By.id("input-firstname");
    private By inputLastName = By.id("input-lastname");
    private By inputEmail = By.id("input-email");
    private By inputPhone = By.id("input-telephone");
    private By inputPassword = By.id("input-password");
    private By inputConfirmPass = By.id("input-confirm");
    private By checkBoxAgree = By.name("agree");
    private By btnContinue = By.xpath("//input[@value='Continue']");

    private By txtDanger = By.xpath("//div[contains(text(),'First Name')] ");

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void completeForm(String name, String lastName, String email, String phone, String password){
        sendKeys(inputFirstName, name);
        sendKeys(inputLastName, lastName);
        sendKeys(inputEmail, email);
        sendKeys(inputPhone, phone);
        sendKeys(inputPassword, password);
        sendKeys(inputConfirmPass, password);
        click(checkBoxAgree);
        click(btnContinue);
    }
    public boolean txtErrorIsDisplayed(){
        return isDisplayed(txtDanger);
    }
}
