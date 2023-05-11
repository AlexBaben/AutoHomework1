package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ShouldSayAboutRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 850;
        int expected = 150;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldNotSayAboutRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}