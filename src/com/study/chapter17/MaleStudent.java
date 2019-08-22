package com.study.chapter17;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {

    private List<Student> list;

    public MaleStudent()
    {
        list = new ArrayList<Student>();
    }

    /**
     * 요소를 수집하는 메서드
     * @param student
     */
    public void accmulate(Student student) {
        list.add(student);
        System.out.println("["+ Thread.currentThread().getName() + "] MaleStudent()");
    }

    /**
     * 두 MaleStudent를 결합하는 메소드
     * @param other
     */
    public void combine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("["+ Thread.currentThread().getName() + "] Combine()");
    }

    public List<Student> getList() {
        return list;
    }
}
