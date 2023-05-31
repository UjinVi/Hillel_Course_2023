package Testpacage;

import org.testng.annotations.Test;

public class FIsrtTest {
    @Test
    public void firstTest() {
        System.out.println("Hello");
        System.out.println("Its me " + System.getProperty("name"));
    }
}
