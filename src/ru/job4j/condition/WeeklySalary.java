package ru.job4j.condition;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int count = 0;
        for (int i = 0; i < 7; i++) {
            int pay = 0;
            if (i > 4) {
                pay = hours[i] * 20;
            } else if (hours[i] > 8) {
                pay = 8 * 10 + (hours[i] % 8) * 15;
            } else {
                pay = hours[i] * 10;
            }
            count += pay;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(WeeklySalary.calculate(arr));
    }
}
