package com.chao.reflect.AOP;

public class Test {
    public static void main(String[] args) {
        Dog target = new GunDog();
        Dog dog = (Dog)MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}

