package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

// page_url = https://stellarburgers.nomoreparties.site/
public class BaseHeader {
    public SelenideElement orderConstructor = $x("//*[contains(text(),'Конструктор')]/..");

    public SelenideElement orders = $x("//*[contains(text(),'Лента Заказов')]/..");
    
    public SelenideElement accountPage = $x("//*[contains(text(),'Личный Кабинет')]/..");

}