package com.study.chapter12;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();

        for (Thread thread : threads) {
            System.out.println("thread.getName() + thread.isDaemon() = " + thread.getName() + thread.isDaemon());
            System.out.println("\t소속 그룹 : " + thread.getThreadGroup().getName());
            System.out.println("");
        }
    }
}
