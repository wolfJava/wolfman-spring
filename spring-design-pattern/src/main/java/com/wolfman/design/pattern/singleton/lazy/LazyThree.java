package com.wolfman.design.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 特点：
 *  在外部类被调用的时候内存类才会被加载
 *  内部类一定是要在方法调用之前初始化
 *  巧妙地避免了县城安全问题
 *
 * 这种形式兼顾饿汉模式的内存浪费，也兼顾synchronize性能问题
 * 完美的屏蔽了这两个缺点
 *
 *
 *
 */
public class LazyThree {

    private boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的

    private LazyThree(){
        synchronized (LazyThree.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    //每一个关键字都不是多余
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyThree getInstance(){
        return LazyHolder.lazy;
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyThree lazy = new LazyThree();
    }

}


