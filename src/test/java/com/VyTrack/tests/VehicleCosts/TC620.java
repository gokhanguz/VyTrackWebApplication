package com.VyTrack.tests.VehicleCosts;

import com.VyTrack.pages.*;
import com.VyTrack.tests.TestBase;
import com.VyTrack.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC620 extends TestBase {

    @Test
    public void TC620(){

        LoginPage loginPage=new LoginPage();
        loginPage.loginOptional("storemanager");

        Dashboard VehicleCost=new Dashboard();
        VehicleCost.navigateToModule("Fleet","Vehicle Costs");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        BrowserUtils.waitFor(5);
        calendarEventsPage.vehiclecosts.click();

        VehicleCostPage vehicleCostPage =new VehicleCostPage();
        vehicleCostPage.Type.click();
        BrowserUtils.waitFor(2);

        vehicleCostPage.TypeList.get(2).click();
        vehicleCostPage.TotalPrice.sendKeys("11555");
        vehicleCostPage.Date.click();
        vehicleCostPage.chooseDate.click();
        vehicleCostPage.CostDescription.sendKeys("Explicitly tax");
        vehicleCostPage.ChassisAddButton.click();
        BrowserUtils.waitFor(5);
        //test
    }
}
