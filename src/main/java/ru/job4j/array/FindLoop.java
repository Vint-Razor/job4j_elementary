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

    /**
     * data - массив чисел,
     *
     *     el - элемент, который нужно найти,
     *
     *     start - индекс, с которого начинаем поиск,
     *
     *     finish - индекс, которым заканчиваем поиск.
     * */
    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }
}
