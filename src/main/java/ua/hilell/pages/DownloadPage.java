package ua.hilell.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hilell.Utils.DriverHolder;

public class DownloadPage {
    private WebDriver driver;

    @FindBy(linkText = "some-file.txt")
    private WebElement fileLink;

    public DownloadPage() {
        this.driver = DriverHolder.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String downloadFile() {
        fileLink.click();
        String filePath = waitForDownloadComplete();
        return filePath;
    }
    private String waitForDownloadComplete() {
        String filePath = "/target/downloads";
        return filePath;
    }
}






