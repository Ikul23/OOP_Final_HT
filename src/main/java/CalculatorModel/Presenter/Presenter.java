package CalculatorModel.Presenter;

import CalculatorModel.Model.Logger;
import CalculatorModel.Model.Model;
import CalculatorModel.View.View;

public class Presenter {
    private final View view;
    private final Model model;
    private final Logger logger;

    public Presenter(View view, Model model, Logger logger) {
        this.view = view;
        this.model = model;
        this.logger = logger;
    }

    // Изменение возвращаемого типа на double
    public double buttonClick() {
        double x = view.getRealValue("x"); // Получение значения x
        double y = view.getRealValue("y"); // Получение значения y
        model.setX(x);
        model.setY(y);
        double result = model.result();
        view.print(result, "Result: "); // Вывод результата на экран
        logger.log("Operation performed: " + x + " and " + y + " = " + result); // Логирование операции
        return result; // Возвращение результата операции
    }
}
