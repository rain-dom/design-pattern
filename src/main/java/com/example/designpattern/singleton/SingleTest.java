package com.example.designpattern.singleton;

public class SingleTest {

    private SingleTest() {

    }

    private volatile static SingleTest instance;

    public static SingleTest getInstance() {
        if (instance == null) {
            synchronized (SingleTest.class){
                if (instance == null) {
                    instance = new SingleTest();
                }
            }
        }
        return instance;
    }

}
