package ru.netology;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {

    private CashbackService cashbackService = new CashbackService();

    @Test
    public void more1000() {
        CashbackService service = new CashbackService();
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
        //  падающий тест
        assertEquals(1000, cashbackService.remain(1000));
    }
}