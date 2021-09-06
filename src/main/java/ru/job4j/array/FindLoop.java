package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] date, int el) {
        int rsl = -1;
        for (int index = 0; index < date.length; index++) {
            if (date[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
