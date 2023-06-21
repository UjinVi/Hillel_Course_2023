package ua.hilell.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private final WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public LoginPage clickFormAuthentication() {
        formAuthenticationLink.click();
        return new LoginPage(driver);
    }
}

