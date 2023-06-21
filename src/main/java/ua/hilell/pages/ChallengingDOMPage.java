package ua.hilell.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

public class ChallengingDOMPage {
    private WebDriver driver;

    @FindBy(css = "#content table tr")
    private List<WebElement> tableRows;

    public ChallengingDOMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    public void clickEditButton(int rowNumber) {
        String editButtonXPath = String.format("//*[@id='content']//table/tbody/tr[%d]/td[7]/a[1]", rowNumber);
        WebElement editButton = driver.findElement(By.xpath(editButtonXPath));
        editButton.click();
    }

    public void clickDeleteButton(int rowNumber) {
        String deleteButtonXPath = String.format("//*[@id='content']//table/tbody/tr[%d]/td[7]/a[2]", rowNumber);
        WebElement deleteButton = driver.findElement(By.xpath(deleteButtonXPath));
        deleteButton.click();
    }

    public List<String> getColumnTextValues() {
        return tableRows.stream()
                .map(row -> row.findElement(By.cssSelector("td:nth-of-type(4)")))
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
