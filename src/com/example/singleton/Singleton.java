package com.example.singleton;

/**
 * Created by zhang on 2017/1/6.
 * 单例模式之饿汉式
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
