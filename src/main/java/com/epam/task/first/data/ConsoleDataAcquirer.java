package com.epam.task.first.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    @Override
    public double getNumber(String str) {

        double num;
        Scanner in = new Scanner(System.in);
        System.out.printf("Input %s: %n", str);

        while (!in.hasNextDouble()) {
            System.out.println("That not a number!");
            in.next(); // this is important!
            System.out.printf("Input %s: %n", str);
        }
        num = in.nextDouble();

        return num;
    }
}
