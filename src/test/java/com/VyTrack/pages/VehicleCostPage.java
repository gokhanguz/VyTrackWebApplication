package com.VyTrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class VehicleCostPage extends BasePage{

     WebDriver driver;
    @FindBy(xpath = "//*[text()='Choose a value...']")
    public WebElement Type;

    @FindBy(css = "[id*='custom_entity_type_TotalPrice']")
    public WebElement TotalPrice;

    @FindBy(css = "[placeholder='Choose a date']")
    public WebElement Date;

    @FindBy(css = "[id*='custom_entity_type_CostDescriptions']")
    public WebElement CostDescription;

    @FindBy(xpath= "(//button[@type='button'])[1]")
    public WebElement ChassisAddButton;

    @FindBy(css = "[class='select2-results']>li")
    public List<WebElement> TypeList;

    @FindBy(xpath= "//a[text()='15']")
    public WebElement chooseDate;







}
