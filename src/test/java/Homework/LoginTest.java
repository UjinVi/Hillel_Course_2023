package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testCorrectLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("SuperSecretPassword!");
        loginButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        String messageText = successMessage.getText();

        Assert.assertTrue(messageText.contains("You logged into a secure area!"), "Correct login message is not displayed");

        driver.quit();
    }

    @Test
    public void testIncorrectLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameField.sendKeys("invaliduser");
        passwordField.sendKeys("invalidpassword");
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
        String messageText = errorMessage.getText();

        Assert.assertTrue(messageText.contains("Your username is invalid!"), "Incorrect login message is not displayed");

        driver.quit();
    }
}

