import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IlkOrnek {
    AndroidDriver driver;
    ManWomenPages manWomenPages;
    KampanyaPages kampanyaPages;
    HomePage homePage;
    SearchPage searchPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("Android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("trendyol.com");
        caps.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
        caps.setNoReset(false);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        manWomenPages = new ManWomenPages(driver);
        kampanyaPages = new KampanyaPages(driver);
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void test1() {
        String elementText = manWomenPages.getTextText();
        Assert.assertEquals(elementText, "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?");
    }

    @Test
    public void test2() {
        manWomenPages.clickErkekButton();
        String elementText = kampanyaPages.getTextNotification();
        Assert.assertEquals(elementText, "Yeni ürün ve kampanyaları önce sen öğrenmek ister misin?");
    }

    @Test
    public void test3() {
        manWomenPages.clickErkekButton();
        kampanyaPages.clickCloseButton();
        String elementText = homePage.getTextPopupText();
        Assert.assertEquals(elementText, "Sana Özel Ürün ve Koleksiyonları Keşfet!");
    }

    @Test
    public void test4() {
        manWomenPages.clickErkekButton();
        kampanyaPages.clickCloseButton();

        homePage.clickPopupCloseButton();
        homePage.clickSearchBar();

        searchPage.sendKeysSearchBar("Mavi");
        searchPage.clickSearchButtonOnKeyboard();
        String elementText = productsPage.getTextPopup();
        Assert.assertEquals(elementText, "Sonuçları sırala ve filtrele!");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


}
