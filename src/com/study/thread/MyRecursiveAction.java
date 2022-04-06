package com.study.thread;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class MyRecursiveAction extends RecursiveAction {

    private long workLoad = 0;

    public MyRecursiveAction(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {
        String threadName = Thread.currentThread().getName();

        if (this.workLoad > 16) {
            System.out.println("[" + LocalTime.now() + "][" + threadName + "]"
                + " Splitting workLoad : " + this.workLoad);
            sleep(1000);

            List<MyRecursiveAction> subtasks = new ArrayList<>();
            subtasks.addAll(createSubtasks());

            for (RecursiveAction subtask : subtasks) {
                subtask.fork();
            }
        } else {
            System.out.println("[" + LocalTime.now() + "][" + threadName + "]"
                + " Doing workLoad myself: " + this.workLoad);
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<MyRecursiveAction> createSubtasks() {
        List<MyRecursiveAction> subtasks = new ArrayList<>();

        MyRecursiveAction subtasks1 = new MyRecursiveAction(this.workLoad / 2);
        MyRecursiveAction subtasks2 = new MyRecursiveAction(this.workLoad / 2);

        subtasks.add(subtasks1);
        subtasks.add(subtasks2);

        return subtasks;
    }

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(128);
        forkJoinPool.invoke(myRecursiveAction);

        forkJoinPool.awaitTermination(5, TimeUnit.SECONDS);
    }
}
