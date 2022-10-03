package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://stellarburgers.nomoreparties.site/login
public class LoginPage extends BaseHeader {
    public SelenideElement inputEmail = $("input[name=\"name\"]");

    public SelenideElement inputPassword = $("input[name=\"Пароль\"]");

    public SelenideElement inputButton = $(byText("Войти"));

    public SelenideElement registrationLink = $(byText("Зарегистрироваться"));

    public SelenideElement restorePasswordLink = $(byText("Восстановить пароль"));

}