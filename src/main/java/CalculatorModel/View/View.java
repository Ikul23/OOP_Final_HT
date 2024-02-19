package CalculatorModel.View;


import CalculatorModel.Model.ComplexNumber;

import java.util.Locale;
import java.util.Scanner;

public class View {
    private final Scanner in;

    public View() {
        in = new Scanner(System.in).useLocale(Locale.US);
    }

    public int chooseNumberType() {
        System.out.println("Выберите тип чисел:");
        System.out.println("1. Реальные числа");
        System.out.println("2. Комплексные числа");
        System.out.print("Ваш выбор: ");
        return in.nextInt();
    }

    public double getRealValue(String title) {
        System.out.printf("Введите значение для %s: ", title);
        return in.nextDouble();
    }

    public ComplexNumber getComplexNumber(String title) {
        System.out.println("Введите значение для " + title + " (действительную часть):");
        double real = in.nextDouble();
        System.out.println("Введите значение для " + title + " (мнимую часть):");
        double imaginary = in.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void print(double data, String title) {
        System.out.printf("%s %.1f%n", title, data);
    }

    public void printComplexNumber(ComplexNumber number, String title) {
        System.out.printf("%s: %.1f + %.1fi%n", title, number.getReal(), number.getImaginary());
    }

    public double getValue(String s) {
        System.out.print(s);
        return in.nextDouble();
    }
}
