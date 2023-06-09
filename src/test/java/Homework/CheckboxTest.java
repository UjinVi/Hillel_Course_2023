package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxTest {

    @Test
    public void testCheckboxSelection() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/checkboxes");


        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes input:nth-of-type(1)"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes input:nth-of-type(2)"));


        System.out.println("Checkbox 1: " + checkbox1.isSelected());
        System.out.println("Checkbox 2: " + checkbox2.isSelected());

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        System.out.println("Checkbox 1: " + checkbox1.isSelected());
        System.out.println("Checkbox 2: " + checkbox2.isSelected());

        driver.quit();
    }
}


