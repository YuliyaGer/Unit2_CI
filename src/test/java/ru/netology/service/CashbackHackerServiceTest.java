package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerServiceTest {

//    @Test
//    void calculateCashback() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 900;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 100;
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    void noCalculateCashback() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//        int actual = cashbackHackService.remain(amount);
//        int expected = 0;
//        Assertions.assertEquals(expected, actual);
//    }

        @ParameterizedTest
        @CsvFileSource(resources="/CashbackDate.csv", numLinesToSkip=1)
        void calculateCashback (int amount, int expected) {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int actual = cashbackHackService.remain(amount);
            Assertions.assertEquals(expected, actual);
        }
    }

