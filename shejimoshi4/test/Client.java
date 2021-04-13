package com.shejimoshi4.test;

import com.shejimoshi4.factory.LogFactory;
import com.shejimoshi4.log.Log;


public class Client{
    private static Object XMLUtil;

    public static void main(String[] args){
        try{
            LogFactory factory = (LogFactory) XMLUtil.getBean();
            Log log = factory.createLog();
            log.writeLog();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
