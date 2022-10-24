package ui.commonActionForPage;

import com.codeborne.selenide.Selenide;

public interface CommonAction {

    default void open(String URL) {
        Selenide.open(URL);
    }
}
