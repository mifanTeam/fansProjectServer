package com.fun.core.task;

import org.apache.log4j.Logger;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Milo on 2016/12/1.
 */
public class AutoTask {
    private static Logger logger = Logger.getLogger(AutoTask.class.getName());

    public void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        logger.info("任务1：每分钟定时获取当前系统时间"+date);
    }

    public void auto() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage(); //椎内存使用情况
        long totalMemorySize = memoryUsage.getInit(); //初始的总内存
        long maxMemorySize = memoryUsage.getMax(); //最大可用内存
        long usedMemorySize = memoryUsage.getUsed(); //已使用的内存
        logger.info("任务2：后台监控椎内存使用情况"+"^_^" + "椎内存使用情况：" + "1.初始的总内存:" + totalMemorySize + "2.最大可用内存:" + maxMemorySize + "3.已使用的内存:" + usedMemorySize);
    }

    public void zd(){
        logger.info("------------------------------------------------");
    }

}