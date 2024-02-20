package CalculatorModel.Model;

public class SumModel extends CalcModel {
    private ComplexNumber complexA; // Для комплексных чисел
    private ComplexNumber complexB; // Для комплексных чисел

    public void setComplexA(ComplexNumber complexA) {
        this.complexA = complexA;
    }

    public void setComplexB(ComplexNumber complexB) {
        this.complexB = complexB;
    }

    // Переопределяем метод result() для учета комплексных чисел
    @Override
    public double result() {
        double result = 0.0;

        // Если комплексные числа не заданы, выполняем операцию для действительных чисел
        if (complexA == null && complexB == null) {
            result = x + y;
        } else {
            // Для комплексных чисел
            result = complexA.getReal() + complexA.getImaginary() + complexB.getReal() + complexB.getImaginary();
        }

        return result;
    }

    // Методы для установки значений для реальных чисел
    public void setRealX(double realX) {
        this.realX = realX;
    }

    public void setRealY(double realY) {
        this.realY = realY;
    }
}
