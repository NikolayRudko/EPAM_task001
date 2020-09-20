package com.epam.task.first.data;

public class InputFactory {

    public DataAcquirer creatorAcquirer(String type) {
        if (type.equals("Console")) {
            return new ConsoleDataAcquirer();
        }
        return null;
    }
}
