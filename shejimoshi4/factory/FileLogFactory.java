package com.shejimoshi4.factory;

import com.shejimoshi4.log.FileLog;
import com.shejimoshi4.log.Log;

public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
