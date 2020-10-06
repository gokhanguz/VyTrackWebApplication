package com.VyTrack.pages;

import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //driver.FindElement(By.id("prependedInput"));
    // FindBy same with FindElement
    @FindBy(id="prependedInput")
    public WebElement usernameInput;
    @FindBy(id="prependedInput2")
    public WebElement passwordInput;
    @FindBy(id="_submit")
    public WebElement loginBtn;
    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginAsStoreManager(){
        String username= ConfigurationReader.get("storemanager_username");
        String password= ConfigurationReader.get("storemanager_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    @Test
    public void loginOptional(String userType){
        String username;
        String password;
        switch (userType) {
            case "storemanager":
                username= ConfigurationReader.get("storemanager_username");
                password= ConfigurationReader.get("storemanager_password");
                break;
            case "salesmanager":
                username= ConfigurationReader.get("salesmanager_username");
                password= ConfigurationReader.get("salesmanager_password");
                break;
            case "driver":
                username= ConfigurationReader.get("driver_username");
                password= ConfigurationReader.get("driver_password");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userType);
        }
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
