package ru.netology;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackServiceTest {
    private CashbackService cashbackService = new CashbackService();

    @Test
    public void more1000() {
        assertEquals(400, cashbackService.remain(5600));
    }

    @Test
    public void low1000() {
        assertEquals(850, cashbackService.remain(150));
    }

    @Test
    public void underZero() {
        // негативный падающий тест
        assertEquals(0, cashbackService.remain(-150));
    }

    @Test
    public void exactly1000() {
        // негативный падающий тест
        assertEquals(0, cashbackService.remain(1000));
    }
}
