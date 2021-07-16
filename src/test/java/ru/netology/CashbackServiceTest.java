package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackServiceTest {
    private CashbackService cashbackService = new CashbackService();

    @Test
    public void more1000() {
        CashbackService service = new CashbackService();
        assertEquals(cashbackService.remain(5000), 1000);
    }

    @Test
    public void low1000() {
        assertEquals(cashbackService.remain(150), 850);
    }

    @Test
    public void underZero() {
        assertEquals(cashbackService.remain(-150), 1150);
    }
}