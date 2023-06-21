package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class CheckboxTest {
    private WebDriver driver;

    @FindBy(css = "#checkboxes input:nth-of-type(1)")
    private WebElement checkbox1;

    @FindBy(css = "#checkboxes input:nth-of-type(2)")
    private WebElement checkbox2;

    @Test
    public void testCheckboxSelection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        PageFactory.initElements(driver, this);

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



