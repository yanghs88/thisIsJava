package com.study.chapter12;

import java.awt.*;

public class BeepPrintExample3 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for (int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

//        thread.run();
        thread1.run();
    }
}
