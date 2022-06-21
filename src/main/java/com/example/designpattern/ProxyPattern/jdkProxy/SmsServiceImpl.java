package com.example.designpattern.ProxyPattern.jdkProxy;

public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message,my baby");
        return message;
    }

    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("bibi");
    }

}
