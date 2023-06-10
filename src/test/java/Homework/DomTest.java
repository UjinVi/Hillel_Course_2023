package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import java.util.stream.Collectors;

public class DomTest{

    @Test()
    public void clickEditAndDeleteButtons() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        for (int i = 1; i <= 10; i++) {
            String editButtonXPath = String.format("//*[@id='content']//table/tbody/tr[%d]/td[7]/a[1]", i);
            String deleteButtonXPath = String.format("//*[@id='content']//table/tbody/tr[%d]/td[7]/a[2]", i);

            WebElement editButton = driver.findElement(By.xpath(editButtonXPath));
            editButton.click();

            WebElement deleteButton = driver.findElement(By.xpath(deleteButtonXPath));
            deleteButton.click();
        }

        List<String> columnTextValues = driver.findElements(By.cssSelector("table tr td:nth-of-type(4)"))
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        System.out.println(columnTextValues);

        driver.quit();
    }
}