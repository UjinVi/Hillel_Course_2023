package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ua.hilell.pages.ChallengingDOMPage;
import java.util.List;

public class DomTest {
    @Test
    public void clickEditAndDeleteButtons() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(driver);
        challengingDOMPage.openPage();

        for (int i = 1; i <= 10; i++) {
            challengingDOMPage.clickEditButton(i);
            challengingDOMPage.clickDeleteButton(i);
        }

        List<String> columnTextValues = challengingDOMPage.getColumnTextValues();

        System.out.println(columnTextValues);

        driver.quit();
    }
}
