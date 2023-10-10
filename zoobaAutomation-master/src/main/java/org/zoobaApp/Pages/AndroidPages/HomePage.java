package org.zoobaApp.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class HomePage extends AndroidActions {
    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='More']")
    private WebElement morePage;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Orders\"]")
    private WebElement ordersPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Account\"]")
    private WebElement acc;
    public MorePage goToMorePage () throws InterruptedException {
        Thread.sleep(3000);
        morePage.click();
        return new MorePage(driver);
    }

    public OrdersPage goToOrdersPage (){
        ordersPage.click();
        return new OrdersPage(driver);
    }

    public LoginPage goToAcc (){
        acc.click();
        return new LoginPage(driver);
    }

}
