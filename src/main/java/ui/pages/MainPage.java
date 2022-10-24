package ui.pages;

import api.data.login.LoginCredentions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ui.commonActionForPage.CommonAction;

// page_url = https://stellarburgers.nomoreparties.site
public class MainPage extends BaseHeader implements CommonAction {
    private final String mainPageURL = "https://stellarburgers.nomoreparties.site/";

    public SelenideElement accountLogin = Selenide.$(Selectors.byText("Войти в аккаунт"));

    public SelenideElement buns = Selenide.$(Selectors.byText("Булки"));

    public SelenideElement souces = Selenide.$(Selectors.byText("Соусы"));

    public SelenideElement fillings = Selenide.$(Selectors.byText("Начинки"));

    public ElementsCollection ingredients = Selenide.$$("div[class*=\"ingredients\"]");

    public MainPage open() {
        Selenide.open(mainPageURL);
        return new MainPage();
    }

    public void loginAs(LoginCredentions loginCredentions) {
        accountLogin.click();
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(loginCredentions);
    }
}