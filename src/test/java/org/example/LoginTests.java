/*

Тест-кейс:
        1. Перейти на страницу https://school.qa.guru/cms/system/login;
        2. Проверить отображение текста "Войти" над формой;
        3. Очистить поле ввода логина (почты);
        4. Ввести валидный логин;
        5. Очистить поле ввода пароля;
        6. Ввести валидный пароль;
        7. Нажать на кнопку "Войти";

        "*/

package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

public class LoginTests {
    @BeforeAll
    public static void setupBrowser() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true; // не закрывать браузер по окончанию теста
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }
    @Test
    void successfulLoginTest() {
        open("https://school.qa.guru/cms/system/login"); // переход на страницу https://school.qa.guru/cms/system/login
        SelenideElement entryIsVisible = $(xpath("//h2[contains(text(),'Войти')]"));
            entryIsVisible.shouldHave(text("Войти")); // $ - поиск по xpath

        SelenideElement email = $(By.xpath("//div[@class='field-input-block']/input[@class='form-control form-field-email']"));
            email.clear();
            email.sendKeys("falinpavel96@gmail.com");

        SelenideElement password = $(By.xpath("//div//input[@class='form-control form-field-password']"));
            password.clear();
            password.sendKeys("2556535");

        SelenideElement buttonEntry = $(xpath("//div/div/button[@class='xdget-block xdget-button btn btn-success']"));
            buttonEntry.click();
    }
    @Test
    void unsuccessfulLoginTest() {

    }
}
