package com.epam.task.first.logic;

import com.epam.task.first.entity.Point;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TrigonometricCalculator {

    public Point[] calculateTableValue(double coordinateXA, double coordinateXB, double step) {

        int sizeTable;
       // final double DELTA = 100000;
        final int DELTA = 5;


        if (coordinateXA == coordinateXB || Math.abs(coordinateXA - coordinateXB) < step) {
            sizeTable = 1;
        } else {
            sizeTable = (int) ((Math.abs(coordinateXA - coordinateXB) / step) + 1);
        }

        Point[] resultTable = new Point[sizeTable];

        //Change the direction of reference
        if (coordinateXA > coordinateXB) {
            step = -step;
        }

        double currentCoordinateX = coordinateXA;

        for (int i = 0; i < sizeTable; i++) {
            if (i == sizeTable - 1) {
                currentCoordinateX = coordinateXB;
            }
            double valueFunction = Math.tan(currentCoordinateX);
            // TODO: 19.09.2020  
            //5 decimal precision control
            valueFunction = customRound(valueFunction, DELTA);
            //valueFunction = (valueFunction * DELTA) / DELTA;
            resultTable[i] = new Point(currentCoordinateX, valueFunction);
            //5 decimal precision control
            currentCoordinateX += step;
            currentCoordinateX = customRound(currentCoordinateX, DELTA);
            // currentCoordinateX = (double) Math.round(currentCoordinateX * DELTA) / DELTA;
        }

        return resultTable;
    }

    private double customRound(double value, int places) {
        //if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        //digit discarding
        bd = bd.setScale(places, RoundingMode.DOWN);
        return bd.doubleValue();
    }
}
