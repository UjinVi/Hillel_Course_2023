package Homework16;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.hilell.pages.FileUploadDownloadPageLocators;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SelenideTest {

    @BeforeClass
    public void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.browserSize = "maximize";
        Configuration.downloadsFolder = "/download/target";
    }

    @Test
    public void testFileUploadAndDownload() throws IOException {
        String downloadFilePath = downloadFile();
        modifyFile(downloadFilePath, "New content added!\nMore lines...\n");

        Selenide.open("/");
        uploadFile(downloadFilePath);

        String uploadedFileName = getUploadedFileName();
        System.out.println("Uploaded file name: " + uploadedFileName);
        $(FileUploadDownloadPageLocators.UPLOADED_FILE_NAME).shouldHave(text(uploadedFileName));
    }

    private String downloadFile() {
        Selenide.open("/download");
        Selenide.$(FileUploadDownloadPageLocators.DOWNLOAD_LINK).click();

        return Configuration.downloadsFolder + "/test.txt";
    }

    private void modifyFile(String filePath, String content) throws IOException {
        Path fileToModify = Path.of(filePath);
        Files.writeString(fileToModify, content, StandardOpenOption.APPEND);
    }

    private void uploadFile(String filePath) {
        File file = new File(filePath);
        Selenide.$(FileUploadDownloadPageLocators.UPLOAD_LINK).click();
        Selenide.$(FileUploadDownloadPageLocators.UPLOAD_INPUT).uploadFile(file);
        Selenide.$(FileUploadDownloadPageLocators.UPLOAD_BUTTON).click();
    }

    private String getUploadedFileName() {
        return Selenide.$(FileUploadDownloadPageLocators.UPLOADED_FILE_NAME).getText();
    }
}


