package org.selenide.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void userCanSearchKeywordWithGoogle(){
        Configuration.browser="firefox";
        open("https://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$(".DKV0Md").shouldHave(size(7));
        $(".DKV0Md").shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));

    }
}
