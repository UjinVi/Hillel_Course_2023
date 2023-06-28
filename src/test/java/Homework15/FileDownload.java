package Homework15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownload {

    @Test
    public void fileDownloadTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileLink = driver.findElement(By.linkText("home.png"));
        fileLink.click();

        System.out.println("done");

        driver.quit();
    }
}
