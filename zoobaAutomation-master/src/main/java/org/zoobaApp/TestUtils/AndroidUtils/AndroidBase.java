package org.zoobaApp.TestUtils.AndroidUtils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.zoobaApp.Pages.AndroidPages.OpeningPage;
import org.zoobaApp.TestUtils.AppiumUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AndroidBase extends AppiumUtils {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    public OpeningPage openingPage;

    @BeforeMethod(alwaysRun=true)
    public void ConfigureAppium() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//zoobaApp//Resources//configuration.properties");

        String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        System.out.println(ipAddress);
        prop.load(fis);
        String port = prop.getProperty("port");
        String AppiumPath = prop.getProperty("AppiumPath");

        service = startAppiumServer(ipAddress,Integer.parseInt(port), AppiumPath);

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName(prop.getProperty("AndroidDeviceName"));//emulator
        options.setChromedriverExecutable(System.getProperty("user.dir")+"//src//main//java//org//zoobaApp//TestUtils//Drivers//ChromeDriver//chromedriver.exe");
        options.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        options.setCapability("autoGrantPermissions",true);
        options.setApp(System.getProperty("user.dir")+"//src//main//java//org//zoobaApp//Resources//API-Demos.apk");

        driver = new AndroidDriver(service.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openingPage = new OpeningPage(driver);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        driver.quit();
        service.stop();
    }
}
