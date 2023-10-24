package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import ru.netology.data.Card;

public class DataHelper {

    public static Card getApprovedCard() {
        return new Card("4444444444444441", "03", "27", "Zakirova Zilya", "123");
    }

    public static Card getDeclinedCard() {
        return new Card("4444444444444442", "03", "27", "Zakirova Zilya", "123");
    }

    public static Card getEmptyCard() {
        return new Card("", "", "", "", "");
    }

    private static final Faker faker = new Faker();

    public static String getShiftedMonth(int shift) {
        return LocalDate.now().plusMonths(shift).format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getShiftedYear(int yearCount) {
        return LocalDate.now().plusYears(yearCount).format(DateTimeFormatter.ofPattern("yy"));
    }

    public static Card getNumberCard15Symbols() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(1);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        String number = faker.number().digits(15);
        return new Card(number, month, year, holder, cvv);
    }

    public static Card getCardNumberEmpty() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(4);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card(" ", month, year, holder, cvv);
    }

    public static Card getCardMonth1Symbol() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = faker.number().digit();
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardMonthOver12() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", "13", year, holder, cvv);
    }

    public static Card getCardMonth00ThisYear() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String year = getShiftedYear(0);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", "00", year, holder, cvv);
    }

    public static Card getCardMonthEmpty() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", " ", year, holder, cvv);
    }


    public static Card getCardYear1Symbol() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(-1);
        String year = faker.number().digit();
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardYearEmpty() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(4);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, " ", holder, cvv);
    }

    public static Card getCardYearUnderThisYear() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(1);
        String year = getShiftedYear(-1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardYear00() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, "00", holder, cvv);
    }


    public static Card getCardHolder1Simbol() {
        String holder = faker.name().firstName();
        String month = getShiftedMonth(1);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardHolderCirillic() {
        Faker faker = new Faker(new Locale("ru"));
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(2);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardHolderNumeric() {
        String holder = faker.name().firstName() + " " + faker.number().digit();
        String month = getShiftedMonth(3);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardSpecialSymbols() {
        String holder = faker.name().firstName() + " %$ * &";
        String month = getShiftedMonth(4);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(3);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardCvv1Symbol() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(1);
        String year = getShiftedYear(1);
        String cvv = faker.number().digits(1);
        return new Card("4444444444444441", month, year, holder, cvv);
    }

    public static Card getCardCVVEmpty() {
        String holder = faker.name().firstName() + " " + faker.name().lastName();
        String month = getShiftedMonth(4);
        String year = getShiftedYear(1);
        return new Card("4444444444444441", month, year, holder, " ");
    }


}
