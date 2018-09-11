package com.wolfman.design.pattern.proxy.staticed;

public class Fater {

    private Person person;

    //没办法扩展
    public Fater(Person person){
        this.person = person;
    }

    //目标对象的引用给拿到
    public void findLove(){
        System.out.println("根据你的要求物色");
        this.person.findlove();
        System.out.println("双方父母是不是同意");
    }



}
