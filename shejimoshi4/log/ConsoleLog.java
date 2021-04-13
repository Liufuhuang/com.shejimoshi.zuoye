package com.shejimoshi4.log;

public class ConsoleLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("控制台日志记录");
    }
}
