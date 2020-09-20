package com.epam.task.first.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    @Override
    public String[] getData() {

        String[] input = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a:");
        input[0] = scanner.nextLine();
        System.out.println("Enter number b:");
        input[1] = scanner.nextLine();
        System.out.println("Enter step:");
        input[2] = scanner.nextLine();

        return input;
    }
}
