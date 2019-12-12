package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        System.out.println(actual);
        System.out.println(actual == expected);

    }
}