package ua.hilell.pages;

import org.openqa.selenium.By;

public class FileUploadDownloadPageLocators {
    public static final By UPLOAD_INPUT = By.id("file-upload");
    public static final By UPLOAD_BUTTON = By.id("file-submit");
    public static final By UPLOADED_FILE_NAME = By.id("uploaded-files");
    public static final By DOWNLOAD_LINK = By.linkText("File Download");
    public static final By UPLOAD_LINK = By.linkText("File Upload");
}
