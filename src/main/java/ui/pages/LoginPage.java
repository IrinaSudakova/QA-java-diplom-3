package ui.pages;

import api.data.login.LoginCredentions;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


// page_url = https://stellarburgers.nomoreparties.site/login
public class LoginPage extends BaseHeader {
    public SelenideElement inputEmail = Selenide.$("input[name=\"name\"]");

    public SelenideElement inputPassword = Selenide.$("input[name=\"Пароль\"]");

    public SelenideElement inputButton = Selenide.$(Selectors.byText("Войти"));

    public SelenideElement registrationLink = Selenide.$(Selectors.byText("Зарегистрироваться"));

    public SelenideElement restorePasswordLink = Selenide.$(Selectors.byText("Восстановить пароль"));

    public void loginAs(LoginCredentions loginCredentions) {
        LoginPage loginPage = new LoginPage();
        loginPage.inputEmail.setValue(loginCredentions.getEmail());
        loginPage.inputPassword.setValue(loginCredentions.getPassword());
        loginPage.inputButton.click();
    }

}