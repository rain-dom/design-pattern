package com.example.designpattern.singleton;

public class MySingle {

    private MySingle() {

    }

    private final static MySingle mySingle = new MySingle();

    public static MySingle getMySingle() {
        return mySingle;
    }

}
