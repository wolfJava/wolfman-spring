package com.wolfman.design.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazyOne {

    public LazyOne(){}

    //静态块，公共内存存储
    private static LazyOne lazyOne = null;

    public static LazyOne getInstance(){
        //调用方法之前，先判断
        //如果没有初始化，将其进行初始化，并且赋值
        if (lazyOne == null){
            //两个线程都会进入这个if里面
            lazyOne = new LazyOne();
        }
        //如果已经初始化，直接返回之前已经存储好的结果
        return lazyOne;
    }




}
