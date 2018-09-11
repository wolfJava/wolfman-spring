package com.wolfman.design.pattern.proxy.staticed;

public class StaticProxyTest {

    public static void main(String[] args) {
        //只能帮儿子找对象
        //不能帮表妹、不能帮陌生人
        Fater fater = new Fater(new Son());
        fater.findLove();
    }

}
