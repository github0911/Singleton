package com.example.singleton.three;

/**
 * Created by zhang on 2017/1/6.
 * 单例模式之懒加载
 * 这样又出现了性能问题，简单粗暴的同步整个方法，导致同一时间内只有一个线程能够调用getInstance方法
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
