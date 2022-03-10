package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void showBelowBoundary() {
        int purchaseAmount = 600;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 400;
        assertEquals(actualResult, expectedResult);

    }

    @Test
    public void showHigherBoundary() {
        int purchaseAmount = 1300;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 700;
        assertEquals(actualResult, expectedResult);

    }

    @Test
    public void showNullBoundary() {
        int purchaseAmount = 0;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);

    }

    @Test
    public void showEqualBoundary() {
        int purchaseAmount = 1000;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);

    }
}

