package com.example.singleton.two;

/**
 * Created by zhang on 2017/1/6.
 * 单例模式之懒加载
 * 线程不安全
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
