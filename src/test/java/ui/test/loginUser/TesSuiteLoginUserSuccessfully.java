package ui.test.loginUser;

import api.data.login.LoginCredentions;
import api.data.register.RegisterCredentials;
import api.data.register.RegisteredUser;
import api.data.users.AccessToken;
import api.data.users.UsersFactory;
import api.services.BaseUserApiMethod;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import ui.pages.MainPage;
import ui.pages.UserProfilePage;
import ui.test.BaseUITest;

public class TesSuiteLoginUserSuccessfully extends BaseUITest {

    private RegisterCredentials registerCredentials;
    private BaseUserApiMethod baseUserApiMethod;
    private LoginCredentions loginCredentions;

    private AccessToken accessToken;
    private RegisteredUser registeredUser;
    private MainPage mainPage;


    @Before
    public void setUp() {
        baseUserApiMethod = new BaseUserApiMethod();
        loginCredentions = new LoginCredentions();
        accessToken = new AccessToken();
        registeredUser = new RegisteredUser();
        mainPage = new MainPage();
    }

//    @After
//    public void tearDown() {
//        // delete User
//        accessToken.setAccessToken(registeredUser.getAccessToken());
//        baseUserApiMethod.deleteUserWithCurrent(accessToken);
//    }

    @Feature("login user")
    @Test
    @DisplayName("Can login for valid user")
    public void userCanLoginWithValidCredentials() {
        registerCredentials = UsersFactory.getRandomUser();
        // register new user
        registeredUser = baseUserApiMethod.registerUserWithCurrent(registerCredentials);
        baseUserApiMethod.setCurrentLoginCredentials(registerCredentials, loginCredentions);

        mainPage.open()
                .loginAs(loginCredentions);
        mainPage.accountPage.click();

        UserProfilePage userProfilePage = at(UserProfilePage.class);
        userProfilePage.userName.shouldHave(Condition.value(registerCredentials.getName()));
        userProfilePage.userLogin.shouldHave(Condition.value(registerCredentials.getEmail()));

    }
}
