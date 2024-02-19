package CalculatorModel;

import CalculatorModel.Model.Logger;
import CalculatorModel.Model.ComplexNumber;
import CalculatorModel.Model.SumModel;
import CalculatorModel.Presenter.Presenter;
import CalculatorModel.View.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        int choice = view.chooseNumberType();

        SumModel model = new SumModel();

        if (choice == 1) {
            double x = view.getRealValue("x");
            double y = view.getRealValue("y");
            model.setX(x);
            model.setY(y);
        } else {
            ComplexNumber complexA = view.getComplexNumber("a");
            ComplexNumber complexB = view.getComplexNumber("b");
            model.setComplexX(complexA.getReal(), complexA.getImaginary());
            model.setComplexY(complexB.getReal(), complexB.getImaginary());
        }

        Logger logger = new Logger("calculator.log");
        Presenter presenter = new Presenter(view, model, logger);
        presenter.buttonClick();
    }
}
