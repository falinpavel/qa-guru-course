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
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends LoginPage {
    @BeforeAll
    public static void setupBrowser() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true; // не закрывать браузер по окончанию теста
        Configuration.reopenBrowserOnFail = true;
        //Configuration.screenshots = true; // делаем ли скрины при неудачном тесте
        //Configuration.reportsFolder = ""; // папка для сохранения скринов
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }
    @Test
    void successfulLoginTest() {
        //open("https://qa.guru/");
        //baseButton.hover();
        //baseButton.click();
        open("https://school.qa.guru/cms/system/login"); // переход на страницу https://school.qa.guru/cms/system/login
        entryIsVisible.shouldHave(text("Войти")); // $ - поиск по xpath
        email.clear();
        email.sendKeys("falinpavel96@gmail.com");
        password.clear();
        password.sendKeys("2556535");
        buttonEntry.click();
    }
    @Test
    void unsuccessfulLoginTest() {

    }
}
