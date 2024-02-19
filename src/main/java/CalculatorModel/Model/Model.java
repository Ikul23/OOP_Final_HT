package CalculatorModel.Model;

public interface Model {
    double result();
    void setX(double value);
    void setY(double value);
    void setComplexX(double real, double imaginary); // Новый метод для установки комплексного числа
    void setComplexY(double real, double imaginary); // Новый метод для установки комплексного числа
}
