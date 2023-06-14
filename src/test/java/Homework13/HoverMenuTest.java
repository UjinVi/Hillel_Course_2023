package Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class HoverMenuTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testHoverMenu() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[3]/a"));

        Actions actions = new Actions(driver);
        actions.click(dropdownElement).perform();

        WebElement secondaryMenuElement = driver.findElement(By.linkText("Secondary Menu"));
        actions.moveToElement(secondaryMenuElement).perform();

        WebElement secondaryActionElement = driver.findElement(By.linkText("Secondary Action"));
        actions.moveToElement(secondaryActionElement).click().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pageTitleElement = wait.until(driver -> driver.findElement(By.tagName("h1")));

        String actualText = pageTitleElement.getText();
        String expectedText = "Secondary Page";
        Assert.assertEquals(actualText, expectedText, "Text 'Secondary Page' is not displayed.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

