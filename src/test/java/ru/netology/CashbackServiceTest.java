package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {
    @Test
    void shouldReturn10IfAmountIs2000() {
        CashbackService service = new CashbackService();
        int amount = 2000;

        int actual = service.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn5IfAmountIs1550() {
        CashbackService service = new CashbackService();
        int amount = 1550;

        int actual = service.calculateBonus(amount);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        CashbackService service = new CashbackService();
        int amount = 900;

        int actual = service.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}