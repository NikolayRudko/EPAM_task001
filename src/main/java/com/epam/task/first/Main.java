package com.epam.task.first;

import com.epam.task.first.data.DataAcquirer;
import com.epam.task.first.entity.Point;
import com.epam.task.first.data.InputFactory;
import com.epam.task.first.view.OutputFactory;
import com.epam.task.first.logic.TrigonometricCalculator;
import com.epam.task.first.view.ResultPrinter;

public class Main {
    public static void main(String[] args) throws Exception {
        //input
        InputFactory inputFactory = new InputFactory();
        DataAcquirer acquirer = inputFactory.creatorAcquirer("Console");
        double numberA = acquirer.getNumber("number A");
        double numberB = acquirer.getNumber("number B");
        double step = acquirer.getNumber("step");

        //calculate
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        Point[] tableValue = calculator.calculateTableValue(numberA, numberB, step);

        //output
        OutputFactory outputFactory = new OutputFactory();
        ResultPrinter printer = outputFactory.creatorPrinter("Console");
        printer.print(tableValue);




    }
}
