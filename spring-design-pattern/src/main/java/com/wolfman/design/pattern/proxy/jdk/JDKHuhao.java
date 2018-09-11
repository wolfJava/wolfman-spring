package com.wolfman.design.pattern.proxy.jdk;

import com.wolfman.design.pattern.proxy.staticed.Person;

public class JDKHuhao implements Person {


    @Override
    public void findlove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");
    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买东西");
    }

    @Override
    public void findJob() {
        System.out.println("月薪20K-50k");
        System.out.println("找工作");

    }
}
