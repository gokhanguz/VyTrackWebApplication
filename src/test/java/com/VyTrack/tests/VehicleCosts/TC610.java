package com.VyTrack.tests.VehicleCosts;

import com.VyTrack.pages.Dashboard;
import com.VyTrack.pages.LoginPage;
import com.VyTrack.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC610 extends TestBase {


    @Test
    public void TC610(){

        LoginPage loginPage=new LoginPage();
        loginPage.loginOptional("storemanager");

        Dashboard VehicleCost=new Dashboard();
        VehicleCost.navigateToModule("Fleet","Vehicle Costs");

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/entity/Extend_Entity_VehicleCosts");
        Assert.assertEquals(VehicleCost.getPageSubTitle(),"All Vehicle Costs");
    }
}
