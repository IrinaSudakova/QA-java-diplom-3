package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

// page_url = https://stellarburgers.nomoreparties.site/
public class BaseHeader {
    public SelenideElement orderConstructor = Selenide.$x("//*[contains(text(),'Конструктор')]/..");

    public SelenideElement orders = Selenide.$x("//*[contains(text(),'Лента Заказов')]/..");
    
    public SelenideElement accountPage = Selenide.$x("//*[contains(text(),'Личный Кабинет')]/..");

}