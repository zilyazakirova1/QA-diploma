package ru.netology.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import ru.netology.data.DataHelper;
import ru.netology.data.DbHelper;
import ru.netology.data.Card;
import ru.netology.page.StartPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentCardTest {
    public static String url = System.getProperty("sut.url");

    @BeforeEach
    public void openPage() {
        open(url);
    }

    @AfterEach
    public void cleanBase() {
        DbHelper.clearDb();
    }

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    void paymentPositiveAllFieldValidApproved() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getApprovedCard());
        payment.waitNotificationApproved();
        assertEquals("APPROVED", DbHelper.getPaymentStatus());
    }

    @Test
    void paymentPositiveAllFieldValidDeclined() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getDeclinedCard());
        payment.waitNotificationFailure();
        assertEquals("DECLINED", DbHelper.getPaymentStatus());
    }

    @Test
    void paymentNegativeAllFieldEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getEmptyCard());
        payment.waitNotificationWrongFormat4Fields();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeNumberCard17Symbols() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getNumberCard17Symbols());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeNumberEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardNumberEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void paymentNegativeMonth1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardMonth1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeMonthOver12() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardMonthOver12());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeMonth00ThisYear() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardMonth00ThisYear());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeMonthEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardMonthEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void paymentNegativeYear00() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardYear00());
        payment.waitNotificationExpiredError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeYear1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardYear1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeYearUnderThisYear() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardYearUnderThisYear());
        payment.waitNotificationExpiredError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void paymentNegativeYearEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardYearEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void paymentNegativeHolder1Simbol() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardHolder1Simbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeHolderCirillic() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardHolderCirillic());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeHolderNumeric() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardHolderNumeric());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeHolderSpecialSymbols() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardSpecialSymbols());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void paymentNegativeHolderEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardHolderEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeCvv1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToBuyPage();
        payment.inputData(DataHelper.getCardCvv1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void paymentNegativeCVVEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardCVVEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


}
