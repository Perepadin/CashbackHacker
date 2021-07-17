package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CashbackServiceTest {
    private CashbackService cashbackService = new CashbackService();

    @Test
    public void more1000() {
        assertEquals(cashbackService.remain(5600), 400);
    }

    @Test
    public void low1000() {
        assertEquals(cashbackService.remain(150), 850);
    }

    @Test
    public void underZero() {
        // негативный падающий тест
        assertEquals(cashbackService.remain(-150), 0);
    }

    @Test
    public void exactly1000() {
        // негативный падающий тест
        assertEquals(cashbackService.remain(1000), 1000);
    }
}
