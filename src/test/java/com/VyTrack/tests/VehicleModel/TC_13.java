package com.VyTrack.tests.VehicleModel;

import com.VyTrack.pages.BasePage;
import com.VyTrack.pages.Dashboard;
import com.VyTrack.pages.LoginPage;
import com.VyTrack.tests.TestBase;
import com.VyTrack.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_13 extends TestBase {

    @Test
    public void tc1310(){

        LoginPage loginPage=new LoginPage();

        loginPage.loginOptional("storemanager");

       // WebElement fleetdropdown= driver.findElement(By.xpath("(//*[@*='title title-level-1'])[2]"));
       // BrowserUtils.hover(fleetdropdown);
       // BrowserUtils.verifyElementDisplayed(fleetdropdown);
        // driver.findElement(By.xpath("//*[text()='Vehicles Model']")).click();

        Dashboard dashboard=new Dashboard();
        dashboard.navigateToModule("Fleet","Vehicles Model");
        BrowserUtils.waitFor(3);
        
        String expectedUrl="https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);



    }

    @Test
    public void test1320(){
        LoginPage loginPage=new LoginPage();

        loginPage.loginOptional("driver");

        WebElement fleetdropdown= driver.findElement(By.xpath("(//*[@*='title title-level-1'])[2]"));

        BrowserUtils.hover(fleetdropdown);

        BrowserUtils.verifyElementDisplayed(fleetdropdown);

        driver.findElement(By.xpath("//*[text()='Vehicles Model']")).click();
        String expectedUrl="https://qa2.vytrack.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);

    }
}
