package ru.job4j.loop;
/**
 * amount - сумма выданная по кредиту
 * salary - годовой доход
 * percent - процентная ставка по кредиту.
 * */
public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
