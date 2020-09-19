package com.epam.task.first.factory;

import com.epam.task.first.data.ConsoleDataAcquirer;
import com.epam.task.first.data.DataAcquirer;

public class InputFactory {

    public DataAcquirer newInstance(String type) {
        if (type.equals("Console")) {
            return new ConsoleDataAcquirer();
        }
        return null;
    }
}
