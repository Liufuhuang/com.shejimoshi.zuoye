package com.shejimoshi4.log;

public class DatabaseLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("数据库记录");
    }
}
