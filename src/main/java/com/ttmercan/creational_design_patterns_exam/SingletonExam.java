package com.ttmercan.creational_design_patterns_exam;

public class SingletonExam {
    private static SingletonExam singletonExam;

    private SingletonExam() {
        System.out.println("Singleton class created");
    }

    public static SingletonExam getSingletonExam() {
        if (singletonExam == null) {
            synchronized (SingletonExam.class) {
                if (singletonExam == null) {
                    singletonExam = new SingletonExam();
                }
            }
        }

        return singletonExam;
    }
}
