package com.shejimoshi4.log;

public class FileLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("文件记录");
    }
}
