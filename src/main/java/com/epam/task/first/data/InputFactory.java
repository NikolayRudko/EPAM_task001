package com.epam.task.first.data;

public class InputFactory {

    public DataAcquirer creatorAcquirer(InputType inputType) throws IllegalAccessException {

        switch (inputType) {
            case FILE:
                return new FileDataAcquirer("./src/main/resources/input.txt");
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalAccessException("Unknown input type");
        }
    }
}
