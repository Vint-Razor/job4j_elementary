package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);

        in = 150;
        expected = 2.5F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 2.5. Test result: " + passed);
    }
}
