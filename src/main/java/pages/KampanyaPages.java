package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KampanyaPages {

    AndroidDriver driver;

    public KampanyaPages(AndroidDriver webDriver) {
        driver = webDriver;
    }


    By closeButton = By.id("trendyol.com:id/imageButtonClose");
    By notification = By.id("trendyol.com:id/textViewOpenNotification");
    By image = By.className("android.widget.ImageView");
    By yesButton = By.id("trendyol.com:id/buttonAccept");


    public void clickCloseButton() {
        driver.findElement(closeButton).click();
    }

    public String getTextNotification() {
        return driver.findElement(notification).getText();
    }

    public boolean checkImage() {
        return driver.findElement(image).isDisplayed();
    }

    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public String getTextYesButton() {
        return driver.findElement(yesButton).getText();
    }

}
