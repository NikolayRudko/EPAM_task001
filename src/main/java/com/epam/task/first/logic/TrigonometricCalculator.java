package com.epam.task.first.logic;

import com.epam.task.first.entity.Point;

public class TrigonometricCalculator {

    public Point[] calculateTableValue(double coordinateXA, double coordinateXB, double step) {

        int sizeTable;

        if (coordinateXA == coordinateXB || Math.abs(coordinateXA - coordinateXB) < step) {
            sizeTable = 1;
        } else if ((coordinateXA - coordinateXB) % step == 0) {
            sizeTable = (int) (Math.abs(coordinateXA - coordinateXB) / step);
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
            //precision control
            valueFunction = (double) Math.round(valueFunction * 100000d) / 100000d;
            resultTable[i] = new Point(currentCoordinateX, valueFunction);
            currentCoordinateX += step;
            //precision control
            currentCoordinateX = (double) Math.round(currentCoordinateX * 100000d) / 100000d;
        }

        return resultTable;
    }
}
