package CalculatorModel;

import CalculatorModel.Presenter.Logger;
import CalculatorModel.Model.ComplexNumber;
import CalculatorModel.Model.SumModel;
import CalculatorModel.Model.MultModel;
import CalculatorModel.Model.DivModel;
import CalculatorModel.Presenter.Presenter;
import CalculatorModel.View.View;

import java.io.File;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

        File logsDirectory = new File("logs");
        if (!logsDirectory.exists()) {
            if (logsDirectory.mkdirs()) {
                System.out.println("Папка logs создана.");
            } else {
                System.out.println("Не удалось создать папку logs.");
            }
            View view = new View();

            // Выбор типа чисел
            int choice = view.chooseNumberType();

            // Создание модели
            SumModel sumModel = new SumModel();
            MultModel multModel = new MultModel();
            DivModel divModel = new DivModel();

            double realX = 0, realY = 0;
            ComplexNumber complexA = null, complexB = null;

            // Ввод значений переменных только один раз в зависимости от выбранного типа чисел
            if (choice == 1) {
                realX = view.getRealValue("x");
                realY = view.getRealValue("y");
            } else {
                complexA = view.getComplexNumber("a");
                complexB = view.getComplexNumber("b");
            }

            // Установка значений в модели
            sumModel.setRealX(realX);
            sumModel.setRealY(realY);
            sumModel.setComplexA(complexA);
            sumModel.setComplexB(complexB);

            multModel.setRealX(realX);
            multModel.setRealY(realY);
            multModel.setComplexA(complexA);
            multModel.setComplexB(complexB);

            divModel.setRealX(realX);
            divModel.setRealY(realY);
            divModel.setComplexA(complexA);
            divModel.setComplexB(complexB);

            // Выбор операции
            int operationChoice = view.chooseOperationType();

            // Выполнение выбранной операции и вывод результата
            double result = 0;
            switch (operationChoice) {
                case 1:
                    result = sumModel.result();
                    view.print(result, "Сумма:");
                    break;
                case 2:
                    result = multModel.result();
                    view.print(result, "Произведение:");
                    break;
                case 3:
                    result = divModel.result();
                    view.print(result, "Результат деления:");
                    break;
                default:
                    System.out.println("Некорректный выбор операции.");
            }

            // Инициализация логгера и презентера
            Logger logger = new Logger("logs/log.txt");
            Presenter presenter = new Presenter(view, sumModel, logger);
            presenter.buttonClick();
            logger.close();
             }
    }
}
