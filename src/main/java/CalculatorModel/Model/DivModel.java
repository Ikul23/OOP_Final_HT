package CalculatorModel.Model;

public class DivModel extends CalcModel {
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

        // Проверяем, заданы ли оба комплексных числа
        if (complexA != null && complexB != null) {
            double divisor = Math.pow(complexB.getReal(), 2) + Math.pow(complexB.getImaginary(), 2);
            double realPart = (complexA.getReal() * complexB.getReal() + complexA.getImaginary() * complexB.getImaginary()) / divisor;
            double imaginaryPart = (complexA.getImaginary() * complexB.getReal() - complexA.getReal() * complexB.getImaginary()) / divisor;
            // Возвращаем результат в виде комплексного числа
            result = realPart + imaginaryPart;
        } else {
            // Если одно или оба комплексных числа не заданы, выполняем операцию для действительных чисел
            if (y != 0) {
                result = x / y;
            } else {
                System.out.println("Деление на ноль.");
            }
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
