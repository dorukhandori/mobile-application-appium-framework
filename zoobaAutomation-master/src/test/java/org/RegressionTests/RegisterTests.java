package org.RegressionTests;

import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.zoobaApp.Pages.AndroidPages.DeliveryDetailsPage;
import org.zoobaApp.Pages.AndroidPages.HomePage;
import org.zoobaApp.Pages.AndroidPages.LoginPage;
import org.zoobaApp.Pages.AndroidPages.MorePage;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidBase;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class RegisterTests extends AndroidBase {
    @Test(dataProvider = "registerData0", groups = {"Register"})
    public void registerWithMobileNumber (HashMap<String, String> input) throws InterruptedException {
        openingPage.clickLater();
        LoginPage loginPage = openingPage.goToLoginPage();

        loginPage.switchToSignUp();
        loginPage.assertName(input.get("nameinvalid"));
        loginPage.assertLastName(input.get("lastnameinvalid"));
        loginPage.assertMobileNumber(input.get("mobilenumberinvalid"));
        loginPage.assertEmailAddress(input.get("emailaddressinvalid"));
        loginPage.assertPassword(input.get("mobilenumberinvalid"));

        loginPage.setName(input.get("name"));
        loginPage.setLastName(input.get("lastname"));
        loginPage.setMobileNumber(input.get("mobilenumber"));
        loginPage.setEmailAddress(input.get("emailaddress"));
        loginPage.setPassword(input.get("password"));
        loginPage.submitRegister();
        DeliveryDetailsPage deliveryDetailsPage = loginPage.clickVerify();

        deliveryDetailsPage.switchToSelfPickupTab();
        HomePage homePage = deliveryDetailsPage.confirmDelivery();

        MorePage morePage = homePage.goToMorePage();

        morePage.goToAccInfo();
        morePage.deleteAcc(input.get("password"));

        homePage.goToAcc();
        loginPage.setMobileNumber(input.get("mobilenumber"));
        loginPage.setPassword(input.get("password"));
        loginPage.submitLogin();
        //invalid credentials toast message assertion
    }

    @Test(dataProvider = "registerData1", groups = {"Register"})
    public void registerWithGoogle(HashMap<String, String> input) throws InterruptedException {
        openingPage.clickLater();
        LoginPage loginPage = openingPage.goToLoginPage();

        loginPage.switchToSignUp();
        DeliveryDetailsPage deliveryDetailsPage = loginPage.registerWithGoogle(input.get("emailaddress"), input.get("password"));

        deliveryDetailsPage.switchToSelfPickupTab();
        HomePage homePage = deliveryDetailsPage.confirmDelivery();
        //logout toast message assertion
    }

    @DataProvider
    public Object[][] registerData0() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//RegressionTestsData//RegisterTestData.json");
        return new Object [][] {{data.get(0)}};
    }

    @DataProvider
    public Object[][] registerData1() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//RegressionTestsData//RegisterTestData.json");
        return new Object [][] {{data.get(1)}};
    }
}
