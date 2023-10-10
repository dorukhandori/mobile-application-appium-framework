package org.zoobaApp.Pages.AndroidPages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class MorePage extends AndroidActions {
    AndroidDriver driver;

    public MorePage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Account Info']")
    private WebElement accInfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Loyalty Points']")
    private WebElement loyaltyPoints;

    @FindBy(xpath = "//android.widget.Button[@text='Delete my account']")
    private WebElement deleteAccButton;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private WebElement deleteConfirmationButton;

    @FindBy(xpath = "//android.widget.EditText[@text='Password*']")
    private WebElement passwordField;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/proceedButton")
    private WebElement proceedButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/actionViewLogout")
    private WebElement logoutButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonPositive")
    private WebElement logoutPositiveButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement morePageScroll;

    public void goToAccInfo(){
        accInfo.click();
    }

    public void deleteAcc(String password) throws InterruptedException {
        deleteAccButton.click();
        deleteConfirmationButton.click();
        passwordField.sendKeys(password);
        proceedButton.click();
        Thread.sleep(2000);
    }

    public void logout() throws InterruptedException {
        Thread.sleep(1500);
        swipeAction(morePageScroll, "up", 1);
        logoutButton.click();
        logoutPositiveButton.click();
        Thread.sleep(3000);
    }

}
