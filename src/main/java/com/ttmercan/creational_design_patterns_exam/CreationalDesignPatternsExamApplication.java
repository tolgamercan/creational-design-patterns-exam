package com.ttmercan.creational_design_patterns_exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalDesignPatternsExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreationalDesignPatternsExamApplication.class, args);
        /* for (int i = 0; i < 5; i++) {
            SingletonExam singletonExam = SingletonExam.getSingletonExam();
        }*/

        MobilePhone mobilePhone=MobilePhoneBuilder.startMobilePhoneBuilder()
                .setBrandName("iphone")
                .setHasFaceId(true)
                .setBatteryCapacity(5L)
                .setTouchable(true)
                .build();

        System.out.println(mobilePhone.toString());
    }
}
