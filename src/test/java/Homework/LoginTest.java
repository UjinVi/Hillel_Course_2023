package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ua.hilell.pages.LoginPage;
import ua.hilell.pages.MainPage;
import ua.hilell.pages.SecurePage;

public class LoginTest {

    @Test
    public void testCorrectLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.open();

        LoginPage loginPage = mainPage.clickFormAuthentication();

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLogButton();

        Assert.assertEquals(securePage.getTitle(), "Secure Area",
                "Wrong page title is displayed");

        securePage.logout();
        driver.quit();
    }

    @Test
    public void testIncorrectLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.open();

        LoginPage loginPage = mainPage.clickFormAuthentication();

        loginPage.enterUsername("invaliduser");
        loginPage.enterPassword("InvalidPassword!");
        loginPage.clickLogButton();

        String errorMessage = loginPage.getErrorMessage();

        Assert.assertEquals(errorMessage, "Your username is invalid!",
                "Incorrect login message is not displayed");

        driver.quit();
    }
}

