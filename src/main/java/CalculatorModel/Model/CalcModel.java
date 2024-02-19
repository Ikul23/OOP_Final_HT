package CalculatorModel.Model;

public abstract class CalcModel implements Model {
    double x;
    double y;

    double realX; // Для комплексных чисел: часть, отвечающая за действительную часть
    double imagX; // Для комплексных чисел: часть, отвечающая за мнимую часть
    double realY;
    double imagY;

    @Override
    public abstract double result();

    @Override
    public void setX(double value) {
        this.x = value;
    }

    @Override
    public void setY(double value) {
        this.y = value;
    }

    @Override
    public void setComplexX(double real, double imaginary) {
        this.realX = real;
        this.imagX = imaginary;
    }

    @Override
    public void setComplexY(double real, double imaginary) {
        this.realY = real;
        this.imagY = imaginary;
    }
}
