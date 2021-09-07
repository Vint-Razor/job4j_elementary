package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean bool : data) {
            if (data[0] != bool) {
                return false;
            }
        }
        return true;
    }
}
