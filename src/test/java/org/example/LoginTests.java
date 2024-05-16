/*

Тест-кейс:
        1. Перейти на страницу https://school.qa.guru/cms/system/login
        2. Проверить отображение текста "Войти

        "*/

package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

public class LoginTests {

    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true; // не закрывать браузер по окончанию теста
        open("https://school.qa.guru/cms/system/login"); // переход на страницу https://school.qa.guru/cms/system/login
        $(xpath("//h2[contains(text(),'Войти')]")).shouldHave(text("Войти")); // $ - поиск по xpath

    }
}
