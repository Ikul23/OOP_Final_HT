package CalculatorModel.Model;

public class MultModel extends CalcModel {

    @Override
    public double result() {
        // Выполнение операции сложения для комплексных чисел
        if (realX != 0 || imagX != 0 || realY != 0 || imagY != 0) {
            return realX * realY * imagX * imagY;
        } else {
            // Для действительных чисел
            return x * y;
        }
    }
}
