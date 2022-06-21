package com.example.designpattern.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("before method" + method.getName());
        Object result = method.invoke(target, objects);
        System.out.println("after method" + method.getName());

        return null;
    }


}


