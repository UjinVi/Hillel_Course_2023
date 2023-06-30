package ua.hilell.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class DynamicLoadingPage {
    private final SelenideElement startButton = $("#start button");
    private final SelenideElement loadingIndicator = $("#loading");
    private final SelenideElement loadedText = $("#finish h4");
    private final SelenideElement FirstLink = $("a[href*='dynamic_loading/1']");
    private final SelenideElement SecondLink = $("a[href*='dynamic_loading/2']");

    public void clickStartButton() {
        startButton.click();
    }

    public void waitForTextToAppear() {
        loadingIndicator.should(Condition.disappear);
        loadedText.should(Condition.appear);
    }

    public String getLoadedText() {
        return loadedText.getText();
    }
    public void closeBrowser() {
        closeWebDriver();
    }

    public void click1Link() {
        FirstLink.click();
    }

    public void click2Link() {
        SecondLink.click();
    }
}


