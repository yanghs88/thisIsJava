package com.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    private long workLoad = 0;

    public MyRecursiveAction(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {
        if (this.workLoad > 16) {
            System.out.println("Splitting workload = " + workLoad);

            List<MyRecursiveAction> subtasks = new ArrayList<>();
            subtasks.addAll(createSubtasks());

            for (RecursiveAction subtask : subtasks) {
                subtask.fork();
            }
        } else {
            System.out.println("Doing workload mySelf  = " + workLoad);
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

    public static void main(String[] args) {
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        forkJoinPool.invoke(myRecursiveAction);
    }
}
