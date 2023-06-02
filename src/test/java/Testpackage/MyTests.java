package Testpackage;

import org.testng.annotations.*;


public class MyTests {

    @Test(dataProvider = "loginDataProvider", groups = "login")
    public void loginTestWithData(String username, String password, String role) {
        // Логика теста на логин
        System.out.println("Login Test with Data - Username: " + username + ", Password: " + password + ", Role: " + role);
    }

    @Test(groups = "login")
    public void loginTestWithoutData() {
        // Логика теста на логин
        System.out.println("Login Test without Data");

        // Условие, при котором тест 1 фейлится
        boolean condition = false;
        if (condition) {
            throw new AssertionError("Condition failed");
        }
    }

    @Test(dependsOnGroups = "login")
    public void dependentTest() {
        // Логика зависимого теста
        System.out.println("Dependent Test");
    }

    @Parameters({"param1", "param2"})
    @Test
    public void parameterizedTest(@Optional String param1, @Optional String param2) {
        // Логика параметризованного теста
        System.out.println("Parameterized Test - Param1: " + param1 + ", Param2: " + param2);
    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] provideLoginData() {
        // Логика генерации тестовых данных для логин-теста
        return new Object[][] {
                {"user1", "pass1", "role1"},
                {"user2", "pass2", "role2"},
                {"user3", "pass3", "role3"}
        };
    }
}


