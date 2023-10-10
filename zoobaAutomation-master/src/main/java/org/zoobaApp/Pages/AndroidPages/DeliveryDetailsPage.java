package org.zoobaApp.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class DeliveryDetailsPage extends AndroidActions {

    AndroidDriver driver;

    public DeliveryDetailsPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    ///////////////Door Delivery
    @FindBy(xpath = "//android.widget.TextView[@text='Door Delivery TEST']")
    private WebElement doorDeliveryTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Add a new location']")
    private WebElement addANewLocationOption;

    @FindBy(xpath = "//android.widget.TextView[@text='Deliver Now']")
    private WebElement deliverNowButton;

    @FindBy(xpath = "//android.widget.Button[@text='Confirm']")
    private WebElement confirmButton;

    /////////////////Drive Through

    @FindBy(xpath = "//android.widget.TextView[@text='Drive Through']")
    private WebElement driveThroughTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Malqa']")
    private WebElement suggestedBranch;

    @FindBy(xpath = "//android.widget.TextView[@text='Choose a different branch']")
    private WebElement chooseDifferentBranch;

    @FindBy(xpath = "//android.widget.TextView[@text='Pickup Now']")
    private WebElement pickupNowOption;

    @FindBy(xpath = "//android.widget.TextView[@text='Pickup Later']")
    private WebElement pickupLaterOption;

   ////////////////Self Pickup
    @FindBy(xpath = "//android.widget.TextView[@text='Self Pickup']")
    private WebElement selfPickupTab;

    public void switchToSelfPickupTab() throws InterruptedException {
        selfPickupTab.click();
        Thread.sleep(500);
    }

    public HomePage confirmDelivery() throws InterruptedException {
        Thread.sleep(1000);
        confirmButton.click();
        return new HomePage(driver);
    }
}
