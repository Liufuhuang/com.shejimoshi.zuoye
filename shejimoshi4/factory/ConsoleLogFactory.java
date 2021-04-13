package com.shejimoshi4.factory;

import com.shejimoshi4.log.ConsoleLog;
import com.shejimoshi4.log.Log;

public class ConsoleLogFactory implements LogFactory{
    public Log createLog(){
        return new ConsoleLog();
    }
}
