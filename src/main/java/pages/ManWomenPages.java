package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManWomenPages {

    AndroidDriver driver;

    public ManWomenPages(AndroidDriver webDriver) {
        driver = webDriver;
    }

    By carpiButonu = By.id("trendyol.com:id/buttonDismiss");
    By image = AppiumBy.xpath("//android.widget.LinearLayout/android.widget.ImageView");
    By text = AppiumBy.className("android.widget.TextView");
    By erkekButonu = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By kadınButonu = AppiumBy.id("trendyol.com:id/buttonSelectGenderWoman");

    /*
    By deneme = AppiumBy.androidUIAutomator("");
    By deneme2 = AppiumBy.iOSClassChain("");
    By deneme3 = AppiumBy.iOSNsPredicateString("");
    By deneme4 = AppiumBy.id("");
    By deneme5 = AppiumBy.xpath("");
    By deneme6 = AppiumBy.className("");
     */



    public void clickCarpiButon() {
        driver.findElement(carpiButonu).click();
    }


    public void checkImage() {
        driver.findElement(image);
    }

    public String getTextText() {
        WebElement element = driver.findElement(text);
        String elementText = element.getText();
        return elementText;
    }

    public void clickErkekButton() {
        driver.findElement(erkekButonu).click();
    }

    public void getErkekButonText() {
        driver.findElement(erkekButonu).click();
    }

    public void clickKadinButton() {
        driver.findElement(kadınButonu).click();
    }

}
