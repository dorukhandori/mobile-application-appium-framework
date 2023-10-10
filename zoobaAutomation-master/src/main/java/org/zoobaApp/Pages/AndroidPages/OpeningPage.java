package org.zoobaApp.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class OpeningPage extends AndroidActions {

    AndroidDriver driver;

    public OpeningPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //tagName[@attribute='value']

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonLater")
    private WebElement later;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonUpdate")
    private WebElement update;
    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/container")
    private WebElement chooseLanguage;

    @FindBy(xpath = "android.widget.TextView[@text='SAUDI ARABIA']")
    private WebElement chooseCountry;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/textViewTerms")
    private WebElement termsAndConditions;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/textViewSkip")
    private WebElement skipLogin;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonLogin")
    private WebElement loginSingUp;

    public void clickLater (){
        later.click();
    }
    public LoginPage goToLoginPage (){
        loginSingUp.click();
        return new LoginPage(driver);
    }

}

