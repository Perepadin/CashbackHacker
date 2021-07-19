package ru.netology;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackServiceTest {

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
        //  падающий тест
        assertEquals(0, cashbackService.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void ApiMore1000() {
        Assertions.assertEquals(400, cashbackService.remain(5600));
    }

    @org.junit.jupiter.api.Test
    public void ApiLow1000() {
        Assertions.assertEquals(850, cashbackService.remain(150));
    }

    @org.junit.jupiter.api.Test
    public void ApiUnderZero() {
        // негативный падающий тест
        Assertions.assertEquals(0, cashbackService.remain(-150));
    }

    @org.junit.jupiter.api.Test
    public void ApiExactly1000() {
        //  падающий тест
        Assertions.assertEquals(0, cashbackService.remain(1000));
    }
}

