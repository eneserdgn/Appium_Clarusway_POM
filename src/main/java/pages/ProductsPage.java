package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    AndroidDriver driver;

    public ProductsPage(AndroidDriver webDriver) {
        driver = webDriver;
    }

    By popup = By.id("trendyol.com:id/textViewTooltipTitle");

    public String getTextPopup() {
        return driver.findElement(popup).getText();
    }

}
