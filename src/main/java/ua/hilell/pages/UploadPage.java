package ua.hilell.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hilell.Utils.DriverHolder;

public class UploadPage {
    private WebDriver driver;

    @FindBy(id = "file-upload")
    private WebElement fileInput;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileName;

    public UploadPage() {
        this.driver = DriverHolder.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void uploadFile(String absoluteFilePath) {
        fileInput.sendKeys(absoluteFilePath);
        uploadButton.sendKeys(Keys.RETURN);
    }

    public String getUploadedFileName() {
        return uploadedFileName.getText();
    }
}



