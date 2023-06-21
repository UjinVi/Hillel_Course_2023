package ua.hilell.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {
    private WebDriver driver;

    @FindBy(tagName = "h2")
    private WebElement pageTitle;
    @FindBy(css = ".button.secondary.radius")
    private WebElement logoutButton;

    public SecurePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return pageTitle.getText();
    }

    public void logout() {
        logoutButton.click();
    }
}


