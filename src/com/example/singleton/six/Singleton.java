package com.example.singleton.six;

/**
 * Created by zhang on 2017/1/6.
 * 内部类实现单例
 * 使用内部类来维护单例的实例，当Singleton被加载时，其内部类并不会被初始化，
 * 故可以确保当 Singleton类被载入JVM时，不会初始化单例类。
 * 只有 getInstance() 方法调用时，才会初始化 instance。
 * 同时，由于实例的建立是时在类加载时完成，故天生对多线程友好，
 * getInstance() 方法也无需使用同步关键字。
 */
public class Singleton {

    /**
     * 私有构造方法
     */
    private Singleton(){

    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，
     * 而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHandler{

        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static final Singleton instance = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonHandler.instance;
    }

}
