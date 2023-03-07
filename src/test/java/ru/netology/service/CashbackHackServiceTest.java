package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemainLess1000() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainMultipleOf1000() {
        int amount = 2000;
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainMore1000() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
