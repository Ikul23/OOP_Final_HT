package CalculatorModel.Presenter;

import CalculatorModel.Model.Logger;
import CalculatorModel.Model.Model;
import CalculatorModel.View.View;

public class Presenter {
    private final View view;
    private final Model model;

    private final Logger logger;
    // абстрактные значения
    public Presenter(View v, Model m, Logger l) { //конструктор задает конкретные значения
        view = v;
        model = m;
        logger = l;
    }

    public void buttonClick(){
        double x = view.getValue("x: ");
        double y = view.getValue("y: ");
        model.setX(x);
        model.setY(y);
        double result = model.result();
        view.print(result, "Sum: ");// данные из модели переходят во View
        logger.log("Выполнена операция: Умножение  " + x + " и " + y + " = " + result);
        logger.log("Выполнена операция: Сложение " + x + " и " + y + " = " + result);
    }

}
