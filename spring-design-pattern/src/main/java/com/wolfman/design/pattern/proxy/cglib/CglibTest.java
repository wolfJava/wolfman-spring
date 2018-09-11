package com.wolfman.design.pattern.proxy.cglib;

public class CglibTest {

    public static void main(String[] args) throws Exception {

        CglibMeipo cglibMeipo = new CglibMeipo();

        ZhangSan zhangSan = (ZhangSan) cglibMeipo.getInstance(ZhangSan.class);

        zhangSan.findlove();
    }

}
