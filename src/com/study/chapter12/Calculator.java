package com.study.chapter12;

public class Calculator {

    private int memory;

    public int getMemory()
    {
        return memory;
    }

    public synchronized void setMemory(int memory)
    {
//        synchronized (this)
        {
            this.memory = memory;

            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
            }

            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }

    }
}
