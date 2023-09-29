package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class StartPage {
    private final SelenideElement buyButton = $$("button").find(exactText("Купить"));
    private final SelenideElement creditButton = $$("button").find(exactText("Купить в кредит"));

    public StartPage() {
        SelenideElement heading = $$("h2").find(Condition.text("Путешествие дня"));
        heading.shouldBe(visible);
    }

    public ru.netology.page.PaymentPage goToPaymentPage() {
        buyButton.click();
        return new ru.netology.page.PaymentPage();
    }

    public ru.netology.page.CreditPage goToCreditPage() {
        creditButton.click();
        return new ru.netology.page.CreditPage();
    }
}