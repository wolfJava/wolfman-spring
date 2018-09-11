package com.wolfman.design.pattern.singleton.lazy;

public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazyTwo = null;

    public static synchronized LazyTwo getInstance(){
        if (lazyTwo == null){
            return new LazyTwo();
        }
        return lazyTwo;
    }

}
