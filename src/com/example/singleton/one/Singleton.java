package com.example.singleton.one;

/**
 * Created by zhang on 2017/1/6.
 * 单例模式之饿汉式
 * 一旦类被加载，单例就会初始化，没有实现懒加载。
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
