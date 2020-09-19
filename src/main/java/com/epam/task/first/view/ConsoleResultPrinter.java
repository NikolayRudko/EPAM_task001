package com.epam.task.first.view;

import com.epam.task.first.entity.Point;

public class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void print(Point... table) {
        for (int i = 0; i < table.length; i++) {
            System.out.printf("i = %3d, x = %5.5f, tg(x) = %5.5f %n",
                    i, table[i].getCoordinateX(), table[i].getCoordinateY());
        }
    }
}
