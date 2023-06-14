package Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;

public class HoverTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testHover() {
        driver.get("https://the-internet.herokuapp.com/hovers");

        List<WebElement> userElements = driver.findElements(By.className("figure"));

        Actions actions = new Actions(driver);

        for (WebElement userElement : userElements) {
            actions.moveToElement(userElement).perform();

            WebElement usernameElement = userElement.findElement(By.tagName("h5"));
            String username = usernameElement.getText();
            System.out.println("Username: " + username);
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
