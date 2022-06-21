package com.example.designpattern.ProxyPattern.cglibProxy;

import com.example.designpattern.ProxyPattern.jdkProxy.JdkProxyFactory;

public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message,my baby");
        return message;
    }

    public static void main(String[] args) {
        SmsServiceImpl proxy = (SmsServiceImpl)CglibProxyFactory.getProxy(SmsServiceImpl.class);
        proxy.send("holy");
    }

}
