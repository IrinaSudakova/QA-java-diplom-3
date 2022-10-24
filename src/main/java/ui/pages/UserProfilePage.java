package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class UserProfilePage {
private final String userProfilePageUrl = "https://stellarburgers.nomoreparties.site/account/profile";
    public SelenideElement userName = Selenide.$x("//label[text()=\"Имя\"]/following::input[1]");
    public SelenideElement userLogin = Selenide.$x("//label[text()=\"Логин\"]/following::input[1]");

    public UserProfilePage open() {
        Selenide.open(userProfilePageUrl);
        return new UserProfilePage();
    }
}
