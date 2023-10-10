package org.zoobaApp.Pages.AndroidPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.zoobaApp.TestUtils.AndroidUtils.AndroidActions;

public class LoginPage extends AndroidActions {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //////////////////Login Tab
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement loginTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Sign up']")
    private WebElement signupTab;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/imageButtonGoogle")
    private WebElement loginWithGoogleButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/imageButtonFacebook")
    private WebElement loginWithFacebookButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/checkbox")
    private WebElement loyaltyCheckbox;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/actionTextViewForgotPassword")
    private WebElement forgotPassword;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonLogin")
    private WebElement loginButton;

    ///////////////////////////////Sign up Tab

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/imageButtonGoogle")
    private WebElement signUpWithGoogleButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/imageButtonFacebook")
    private WebElement signUpWithFacebookButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement nameField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement lastNameField;

    @FindBy(xpath = "//android.widget.EditText[@hint='Mobile Number*']")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//android.widget.EditText[@hint='Email Address*']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//android.widget.EditText[@hint='Password*']")
    private WebElement passwordField;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonSubmit")
    private WebElement submitButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private WebElement verifyButton;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonVerify")
    private WebElement verifyConfirmationButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    private WebElement googleEmailField;

    @FindBy(xpath = "//android.widget.Button[@text='Next']")
    private WebElement googleNextButton;

    @FindBy(xpath = "//android.widget.EditText[@hint='Enter your password']")
    private WebElement googlePasswordField;

    @FindBy(xpath = "//android.widget.Button[@text='I agree']")
    private WebElement googleAgreeButton;

    @FindBy(xpath = "//android.widget.Button[@text='ACCEPT']")
    private WebElement googleAcceptButton;

    @FindBy(xpath = "//android.widget.Button[@text='MORE']")
    private WebElement googleMoreButton;

    @FindBy(id = "com.google.android.gms:id/og_apd_internal_image_view")
    private WebElement registeredMail;

    @FindBy(xpath = "//android.widget.TextView[@text='Never lose your contacts']")
    private WebElement neverLoseYourContacts;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid phone number.']")
    private WebElement mobileNumberToastMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid password.']")
    private WebElement passwordToastMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid name.']")
    private WebElement nameToastMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid email.']")
    private WebElement emailAddressToastMessage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    private WebElement lastNameToastMessage;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/formRegister")
    private WebElement loginPageScroll;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonSubmit")
    private WebElement forgotPasswordSendButton;

    //////////////////////////Forgot Password

    @FindBy(xpath = "//android.widget.EditText[@hint='Confirm Password']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//android.widget.EditText[@hint='Password']")
    private WebElement forgotPasswordField;

    @FindBy(id = "com.leanscale.dcafood.zoobaegypt.beta:id/buttonForgotNewPassword")
    private WebElement forgotPasswordSubmitButton;
    public DeliveryDetailsPage submitLogin() throws InterruptedException {
        loginButton.click();
        Boolean savePassword = driver.findElements(By.id("android:id/autofill_save_title")).size() > 0;
        if(savePassword == true){
            driver.findElement(By.id("android:id/autofill_save_no")).click();
        }
        return new DeliveryDetailsPage(driver);
    }
    public void switchToSignUp(){
        signupTab.click();
    }

    public void setName(String name){
        swipeAction(loginPageScroll, "down", 1);
        nameField.sendKeys(name);
        driver.hideKeyboard();
    }

    public void assertName(String name){
        nameField.click();
        nameField.sendKeys(name);
        lastNameField.click();
        driver.hideKeyboard();
        String toast = nameToastMessage.getText();
        Assert.assertEquals(toast,"Please enter a valid name.");
    }

    public void assertLastName(String lastName){
        lastNameField.sendKeys(lastName);
        nameField.click();
        driver.hideKeyboard();
        String toast = lastNameToastMessage.getText();
        Assert.assertEquals(toast,"Please enter a valid name.");
    }

    public void assertEmailAddress(String mail){
        emailAddressField.sendKeys(mail);
        driver.hideKeyboard();
        passwordField.click();
        driver.hideKeyboard();
        emailAddressField.click();
        driver.hideKeyboard();
        passwordField.click();
        String toast = emailAddressToastMessage.getText();
        Assert.assertEquals(toast,"Please enter a valid email.");
    }

    public void setLastName(String lastName){
        lastNameField.sendKeys(lastName);
        driver.hideKeyboard();
    }

    public void setMobileNumber(String mobileNumber){
        mobileNumberField.sendKeys(mobileNumber);
        driver.hideKeyboard();
    }

    public void setEmailAddress(String mail){
        emailAddressField.sendKeys(mail);
        driver.hideKeyboard();
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
        driver.hideKeyboard();
    }

    public void assertMobileNumber(String mobileNumber){
        mobileNumberField.click();
        mobileNumberField.sendKeys(mobileNumber);
        driver.hideKeyboard();
        passwordField.click();
        driver.hideKeyboard();
        String toast = mobileNumberToastMessage.getText();
        Assert.assertEquals(toast,"Please enter a valid phone number.");
    }

    public void assertPassword(String password){
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        mobileNumberField.click();
        driver.hideKeyboard();
        String toast = passwordToastMessage.getText();
        Assert.assertEquals(toast,"Please enter a valid password.");
    }

    public void submitRegister(){
        submitButton.click();
    }

    public DeliveryDetailsPage clickVerify() throws InterruptedException {
        verifyButton.click();
        for (int i = 0; i < 5; i++) {
            driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_0));
        }
        driver.hideKeyboard();
        verifyConfirmationButton.click();
        Thread.sleep(3000);
        return new DeliveryDetailsPage(driver);
    }

    public DeliveryDetailsPage loginWithGoogle(String mail, String password) throws InterruptedException {
        loginWithGoogleButton.click();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("com.google.android.gms.ui");
        Boolean isregisteredmail = driver.findElements(By.id("com.google.android.gms:id/account_display_name")).size() > 0;
        if (isregisteredmail == true) {
            registeredMail.click();
            Thread.sleep(5000);
        }
        else {
            waitForElementToAppear(googleNextButton,driver, "Next");
            googleEmailField.click();
            new Actions(driver).sendKeys(mail).perform();
            googleNextButton.click();
            Thread.sleep(500);
            googlePasswordField.click();
            new Actions(driver).sendKeys(password).perform();
            Thread.sleep(500);
            googleNextButton.click();
            Boolean loseContacts = driver.findElements(By.xpath("//android.widget.TextView[@text='Never lose your contacts']")).size() > 0;
            if (loseContacts == true){
                driver.findElement(By.xpath("//android.widget.Button[@text='Don’t turn on']")).click();
            }
            Boolean addaHomeAddress = driver.findElements(By.xpath("//android.widget.TextView[@text='Add a home address']")).size() > 0;
            if (addaHomeAddress == true){
                driver.findElement(By.xpath("//android.widget.Button[@text='Not now']")).click();
            }
            googleAgreeButton.click();
            waitForElementToAppear(googleMoreButton,driver, "MORE");
            googleMoreButton.click();
            googleAcceptButton.click();
            Thread.sleep(4000);
        }
        options.setAppPackage("com.leanscale.dcafood.zoobaegypt.beta");
        return new DeliveryDetailsPage(driver);
    }

    public DeliveryDetailsPage registerWithGoogle(String mail, String password) throws InterruptedException {
        signUpWithGoogleButton.click();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("com.google.android.gms.ui");
        Boolean isregisteredmail = driver.findElements(By.id("com.google.android.gms:id/account_display_name")).size() > 0;
        Thread.sleep(2000);

        if (isregisteredmail == true) {
            registeredMail.click();
            Thread.sleep(5000);
        }
        else {
            waitForElementToAppear(googleNextButton,driver, "Next");
            googleEmailField.click();
            new Actions(driver).sendKeys(mail).perform();
            googleNextButton.click();
            Thread.sleep(500);
            googlePasswordField.click();
            new Actions(driver).sendKeys(password).perform();
            Thread.sleep(500);
            googleNextButton.click();
            Thread.sleep(500);
            googleAgreeButton.click();
            waitForElementToAppear(googleMoreButton,driver, "MORE");
            googleMoreButton.click();
            googleAcceptButton.click();
            Thread.sleep(4000);
        }
        options.setAppPackage("com.leanscale.dcafood.zoobaegypt.beta");
        return new DeliveryDetailsPage(driver);
    }

    public void forgotPassword(String mobileNumber){
        forgotPassword.click();
        mobileNumberField.sendKeys(mobileNumber);
        Boolean autofill = driver.findElements(By.xpath("//android.widget.TextView[@text='Autofill with Google']")).size() > 0;
        if(autofill==true){
            driver.findElement(By.id("android:id/button1")).click();
        }
        forgotPasswordSendButton.click();
    }

    public void changePassword(String password){
        forgotPasswordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        forgotPasswordSubmitButton.click();
    }
}
