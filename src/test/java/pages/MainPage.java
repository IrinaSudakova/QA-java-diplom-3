package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://stellarburgers.nomoreparties.site
public class MainPage extends BaseHeader {

    public SelenideElement accountLogin = $(byText("Войти в аккаунт"));

    public SelenideElement buns = $(byText("Булки"));

    public SelenideElement souces = $(byText("Соусы"));

    public SelenideElement fillings = $(byText("Начинки"));

    public ElementsCollection ingredients = $$("div[class*=\"ingredients\"]");


}