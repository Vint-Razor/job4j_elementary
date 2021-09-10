package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int balance = money - price;
        int cent = 0;
        int coinCount = 0;
        while (balance > 0) {
            if (balance >= coins[cent]) {
                balance -= coins[cent];
                rsl[coinCount] = coins[cent];
                coinCount++;
            } else {
                cent++;
            }
        }
        int size = coinCount;
        return Arrays.copyOf(rsl, size);
    }
}
