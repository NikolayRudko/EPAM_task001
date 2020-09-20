package com.epam.task.first;

import com.epam.task.first.data.DataAcquirer;
import com.epam.task.first.data.InputType;
import com.epam.task.first.entity.Point;
import com.epam.task.first.data.InputFactory;
import com.epam.task.first.parser.InputParser;
import com.epam.task.first.view.OutputFactory;
import com.epam.task.first.logic.TrigonometricCalculator;
import com.epam.task.first.view.ResultPrinter;

public class Main {
    public static void main(String[] args) throws Exception {

        final int COUNT_ARGUMENTS = 3;

        //input
        InputFactory inputFactory = new InputFactory();
        // DataAcquirer acquirer = inputFactory.creatorAcquirer(InputType.CONSOLE);
        DataAcquirer acquirer = inputFactory.creatorAcquirer(InputType.FILE);
        InputParser parser = new InputParser();
        double[] data = parser.parseToDouble(COUNT_ARGUMENTS, acquirer.getData());

        //calculate
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        Point[] tableValue = calculator.calculateTableValue(data[0], data[1], data[2]);

        //output
        OutputFactory outputFactory = new OutputFactory();
        ResultPrinter printer = outputFactory.creatorPrinter("Console");
        printer.print(tableValue);
    }
}
