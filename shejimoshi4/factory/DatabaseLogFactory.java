package com.shejimoshi4.factory;

import com.shejimoshi4.log.DatabaseLog;
import com.shejimoshi4.log.Log;

public class DatabaseLogFactory implements LogFactory{
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
