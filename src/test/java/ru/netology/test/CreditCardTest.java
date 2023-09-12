package ru.netology.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import ru.netology.data.DbHelper;
import ru.netology.data.DataHelper;
import ru.netology.data.Card;
import ru.netology.page.StartPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {
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
    void creditPositiveAllFieldValidApproved() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getApprovedCard());
        payment.waitNotificationApproved();
        assertEquals("APPROVED", DbHelper.getCreditRequestStatus());
    }

    @Test
    void creditPositiveAllFieldValidDeclined() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getDeclinedCard());
        payment.waitNotificationFailure();
        assertEquals("DECLINED", DbHelper.getCreditRequestStatus());
    }

    @Test
    void creditNegativeAllFieldEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getEmptyCard());
        payment.waitNotificationWrongFormat4Fields();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeNumberCard17Symbols() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getNumberCard17Symbols());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeNumberEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardNumberEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeMonth1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardMonth1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeMonthOver12() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardMonthOver12());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeMonthEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardMonthEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeMonth00() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardMonth00ThisYear());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void creditNegativeYear00() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardYear00());
        payment.waitNotificationExpiredError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeYear1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardYear1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeYearUnderThisYear() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardYearUnderThisYear());
        payment.waitNotificationExpiredError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeYearEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardYearEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void creditNegativeHolder1Simbol() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardHolder1Simbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeHolderCirillic() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardHolderCirillic());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeHolderNumeric() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardHolderNumeric());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeHolderSpecialSymbols() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardSpecialSymbols());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }


    @Test
    void creditNegativeHolderEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardHolderEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeCvv1Symbol() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardCvv1Symbol());
        payment.waitNotificationWrongFormat();
        assertEquals("0", DbHelper.getOrderCount());
    }

    @Test
    void creditNegativeCVVEmpty() {
        var startPage = new StartPage();
        var payment = startPage.goToCreditPage();
        payment.inputData(DataHelper.getCardCVVEmpty());
        payment.waitNotificationExpirationDateError();
        assertEquals("0", DbHelper.getOrderCount());
    }
}







