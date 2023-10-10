package org.zoobaApp.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class OrdersPage extends AndroidActions {
    AndroidDriver driver;

    public OrdersPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
