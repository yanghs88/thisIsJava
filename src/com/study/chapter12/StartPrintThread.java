package com.study.chapter12;

public class StartPrintThread extends Thread {

    private Thread targetThread;

    public StartPrintThread(Thread thread) {
        this.targetThread = thread;
    }

    @Override
    public void run() {

        while (true) {

            Thread.State state = targetThread.getState();
            System.out.println("targetThread state = " + state);

            if (state == State.NEW) {
                targetThread.start();
            }

            if (state == State.TERMINATED) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
