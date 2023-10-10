package org.RegressionTests;


import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.zoobaApp.Pages.AndroidPages.DeliveryDetailsPage;
import org.zoobaApp.Pages.AndroidPages.LoginPage;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidBase;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ForgotPasswordTest extends AndroidBase {
    public String newPassword;
    @Test(dataProvider = "forgotPasswordData0")
    public void forgotPassword(HashMap<String, String> input) throws InterruptedException {
        openingPage.clickLater();
        LoginPage loginPage = openingPage.goToLoginPage();

        loginPage.forgotPassword(input.get("mobilenumber"));
        loginPage.clickVerify();
        loginPage.changePassword(passwordGenerator()+".");
        loginPage.setMobileNumber(input.get("mobilenumber"));
        loginPage.setPassword(newPassword+".");

        DeliveryDetailsPage deliveryDetailsPage = loginPage.submitLogin();
        Thread.sleep(500);
    }

    @DataProvider
    public Object[][] forgotPasswordData0() throws IOException {
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "//src//test//java//org//RegressionTestsData//ForgotPasswordTestData.json");
        return new Object[][]{{data.get(0)}};
    }

    public String passwordGenerator() {
        int length = 15;
        boolean useLetters = true;
        boolean useNumbers = true;
        newPassword = RandomStringUtils.random(length, useLetters, useNumbers);
        System.out.println("new password="+newPassword+".");

        return newPassword;
    }
}
