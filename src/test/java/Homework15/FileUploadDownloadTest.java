package Homework15;

import Homework.BaseTest;
import org.testng.annotations.Test;
import ua.hilell.pages.DownloadPage;
import ua.hilell.pages.MainPage;
import ua.hilell.pages.UploadPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileUploadDownloadTest extends BaseTest {

    @Test
    public void testFileUploadAndDownload() throws IOException {
        MainPage mainPage = openApp();
        DownloadPage downloadPage = mainPage.navigateToDownloadPage();

        // Скачивание файла
        String downloadedFilePath = downloadPage.downloadFile();

        modifyFile(downloadedFilePath, "New content added!");

        UploadPage uploadPage = mainPage.navigateToUploadPage();
        uploadPage.uploadFile(downloadedFilePath);

        String uploadedFileName = uploadPage.getUploadedFileName();
        System.out.println("Uploaded file name: " + uploadedFileName);
    }

    // Метод для изменения содержимого файла
    private void modifyFile(String filePath, String content) throws IOException {
        Path file = Path.of(filePath);
        Files.writeString(file, content, StandardOpenOption.APPEND);
    }
}




