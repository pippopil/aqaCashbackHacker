package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class CashbackHackServiceTest {

        CashbackHackService service = new CashbackHackService();

        @Test
        public void showBelowBoundary() {
            int purchaseAmount = 600;
            int actualResult = service.remain(purchaseAmount);
            int expectedResult = 400;
            assertEquals(expectedResult, actualResult);

        }

        @Test
        public void showHigherBoundary() {
            int purchaseAmount = 1300;
            int actualResult = service.remain(purchaseAmount);
            int expectedResult = 700;
            assertEquals(expectedResult, actualResult);

        }

        @Test
        public void showNullBoundary() {
            int purchaseAmount = 0;
            int actualResult = service.remain(purchaseAmount);
            int expectedResult = 1000;
            assertEquals(expectedResult, actualResult);

        }

        @Test
        public void showEqualBoundary() {
            int purchaseAmount = 1000;
            int actualResult = service.remain(purchaseAmount);
            int expectedResult = 0;
            assertEquals(expectedResult, actualResult);

        }
    }

