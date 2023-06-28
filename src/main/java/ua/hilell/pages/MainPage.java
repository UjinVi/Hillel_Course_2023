package ua.hilell.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;;

public class MainPage {
    private WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    @FindBy(linkText = "File Download")
    private WebElement downloadLink;

    @FindBy(linkText = "File Upload")
    private WebElement uploadLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void open() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public LoginPage clickFormAuthentication() {
        formAuthenticationLink.click();
        return new LoginPage(driver);
    }

    public DownloadPage navigateToDownloadPage() {
        downloadLink.click();
        return new DownloadPage();
    }

    public UploadPage navigateToUploadPage() {
        uploadLink.click();
        return new UploadPage();
    }
}





