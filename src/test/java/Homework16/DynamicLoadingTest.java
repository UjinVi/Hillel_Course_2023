package Homework16;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.hilell.pages.DynamicLoadingPage;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingTest {

    @BeforeClass
    public void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.browserSize = "maximize";
    }

    @Test
    public void testDynamicLink1() {
        open("/dynamic_loading");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.click1Link();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitForTextToAppear();

        String loadedText = dynamicLoadingPage.getLoadedText();
        assert loadedText.equals("Hello World!");

        dynamicLoadingPage.closeBrowser();
    }

    @Test
    public void testDynamicLink2() {
        open("/dynamic_loading");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.click2Link();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitForTextToAppear();

        String loadedText = dynamicLoadingPage.getLoadedText();
        assert loadedText.equals("Hello World!");

        dynamicLoadingPage.closeBrowser();
    }
}




