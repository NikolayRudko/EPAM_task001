package com.epam.task.first.parser;

import com.epam.task.first.exception.MyException;

public class InputParser {
    public double[] parseToDouble(int countArguments, String[] strings) throws MyException {
        if (strings.length != countArguments) {
            throw new MyException("Defective data!");
        }
        double[] data = new double[countArguments];

        try {
            for (int i = 0; i < countArguments; i++) {
                data[i] = Double.parseDouble(strings[i]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return data;
    }
}
