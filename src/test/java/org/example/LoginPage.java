package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class LoginPage {
    //SelenideElement baseButton = $(By.xpath("//div/a[contains(text(),'Личный кабинет') and @class='tn-atom']"));
    SelenideElement entryIsVisible = $(xpath("//h2[contains(text(),'Войти')]"));
    SelenideElement email = $(By.xpath("//div[@class='field-input-block']/input[@class='form-control form-field-email']"));
    SelenideElement password = $(By.xpath("//div//input[@class='form-control form-field-password']"));
    SelenideElement buttonEntry = $(xpath("//div/div/button[@class='xdget-block xdget-button btn btn-success']"));
}
