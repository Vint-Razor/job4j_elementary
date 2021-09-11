package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int balance = money - price;
        int i = 0;
        int size = 0;
        while (balance > 0) {
            if (balance >= coins[i]) {
                balance -= coins[i];
                rsl[size] = coins[i];
                size++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
