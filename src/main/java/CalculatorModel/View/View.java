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
        System.out.println("1. Действительные числа");
        System.out.println("2. Комплексные числа");
        System.out.print("Ваш выбор: ");
        int choice = in.nextInt();
        in.nextLine(); // Очистка буфера ввода
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

    public int chooseOperationType() {
        System.out.println("Выберите тип операции с числами:");
        System.out.println("1. Суммирование");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        System.out.print("Ваш выбор: ");
        return in.nextInt();
    }
}
