package com.epam.task.first.view;

public class OutputFactory {
    public ResultPrinter creatorPrinter(String type){
        if(type.equals("Console")){
            return new ConsoleResultPrinter();
        }
        return null;
    }
}
