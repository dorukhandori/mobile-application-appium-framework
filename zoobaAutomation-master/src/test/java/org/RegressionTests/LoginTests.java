package org.RegressionTests;

import io.appium.java_client.android.Activity;
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

public class LoginTests extends AndroidBase {
    @Test(dataProvider = "loginData0", groups = {"Login"})
    public void loginWithMobileNumber(HashMap<String, String> input) throws InterruptedException {
        openingPage.clickLater();
        LoginPage loginPage = openingPage.goToLoginPage();

        loginPage.assertMobileNumber(input.get("mobilenumberinvalid"));
        loginPage.assertPassword(input.get("passwordinvalid"));

        loginPage.setMobileNumber(input.get("mobilenumber"));
        loginPage.setPassword(input.get("password"));
        DeliveryDetailsPage deliveryDetailsPage = loginPage.submitLogin();

        deliveryDetailsPage.switchToSelfPickupTab();
        HomePage homePage = deliveryDetailsPage.confirmDelivery();
        Thread.sleep(500);
    }

    @Test(dataProvider = "loginData1", groups = {"Login"})
    public void loginWithGoogle(HashMap<String, String> input) throws InterruptedException {
        openingPage.clickLater();
        LoginPage loginPage = openingPage.goToLoginPage();

        DeliveryDetailsPage deliveryDetailsPage = loginPage.loginWithGoogle(input.get("emailaddress"), input.get("password"));

        deliveryDetailsPage.switchToSelfPickupTab();
        HomePage homePage = deliveryDetailsPage.confirmDelivery();
        Thread.sleep(500);
    }

    @DataProvider
    public Object[][] loginData0() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "//src//test//java//org//RegressionTestsData//LoginTestData.json");
        return new Object[][]{{data.get(0)}};
    }

    @DataProvider
    public Object[][] loginData1() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "//src//test//java//org//RegressionTestsData//LoginTestData.json");
        return new Object[][]{{data.get(1)}};
    }
}
