package com.lsc.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogWriter {

    private static Logger sLogger = LoggerFactory.getLogger(LogWriter.class);

    /**
     * 记录基本信息
     * @param msg
     */
    public static void info(String msg){
        sLogger.info(msg);
    }

    /**
     * 记录基本对象信息
     * @param object
     * @param msg
     */
    public static void info(Object object, String msg){
        sLogger.info("[" + object.getClass().getName() + "]:" + msg);
    }

    /**
     * 记录debug信息
     * @param msg
     */
    public static void debug(String msg){
        sLogger.debug(msg);
    }

    /**
     * 记录debug对象信息
     * @param object
     * @param msg
     */
    public static void debug(Object object, String msg){
        sLogger.debug("[" + object.getClass().getName() + "]:" + msg);
    }

    /**
     * 记录debug异常信息
     * @param object
     * @param throwable
     */
    public static void debug(Object object, Throwable throwable){
        sLogger.debug(JSONObject.toJSONString(object), throwable);
    }

    /**
     * 记录警告信息
     * @param msg
     */
    public static void warn(String msg){
        sLogger.warn(msg);
    }

    /**
     * 记录警告对象信息
     * @param object
     * @param msg
     */
    public static void warn(Object object, String msg){
        sLogger.warn("[" + object.getClass().getName() + "]:" + msg);
    }

    /**
     * 记录error信息
     * @param msg
     */
    public static void error(String msg){
        sLogger.error(msg);
    }

    /**
     * 记录error对象信息
     * @param object
     * @param msg
     */
    public static void error(Object object, String msg){
        sLogger.error("[" + object.getClass().getName() + "]:" + msg);
    }

    /**
     * 记录error异常信息
     * @param object
     * @param throwable
     */
    public static void error(Object object, Throwable throwable){
        throwable.printStackTrace();
        sLogger.error(JSONObject.toJSONString(object), throwable);
    }

    /**
     * 打印信息
     * @param msg
     */
    private static void printData(String msg){
        System.out.println(msg);
    }
}
