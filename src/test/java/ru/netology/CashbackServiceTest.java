package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackServiceTest {
    private CashbackService cashbackService = new CashbackService();

    @Test
    public void more1000() {
        CashbackService service = new CashbackService();
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
}