package com.epam.task.first.factory;

import com.epam.task.first.view.ConsoleResultPrinter;
import com.epam.task.first.view.ResultPrinter;

public class OutputFactory {
    public ResultPrinter newInstance(String type){
        if(type.equals("Console")){
            return new ConsoleResultPrinter();
        }
        return null;
    }
}
