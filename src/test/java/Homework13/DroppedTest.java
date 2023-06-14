package Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DroppedTest {
    @Test
    public void DragAndDropTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");


        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).perform();


        String actualText = targetElement.getText();
        String expectedText = "Dropped!";
        Assert.assertEquals(actualText, expectedText, "Text 'Dropped!' is not displayed.");

        driver.quit();
            }
        }