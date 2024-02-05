package mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BasicTest {
    public static void main(String[] args) {

        AppiumDriver<WebElement> driver = null;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Medium_Phone_API_33");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "D:\\Project\\AutoTest\\src\\main\\java\\mobile\\app" +
                "\\wikipedia-2-7-50450-huawei-2023-08-15.apk");

        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("org.wikipedia:id/fragment_onboarding_skip_button")).click();
        driver.findElement(By.xpath("//*[@text='Search Wikipedia']")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("Appium");
        driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String articleName = driver.findElement(By.xpath("(//android.widget.TextView[@text='Appium'])[1]"))
                .getText();

        assertThat(articleName).isEqualTo("Appium");
    }
}
