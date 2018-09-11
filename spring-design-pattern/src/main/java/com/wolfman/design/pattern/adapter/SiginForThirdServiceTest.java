package com.wolfman.design.pattern.adapter;

import com.wolfman.design.pattern.adapter.passPort.SiginForThirdService;

public class SiginForThirdServiceTest {

    public static void main(String[] args) {

        SiginForThirdService service = new SiginForThirdService();

        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式
        System.out.println(service.loginForQQ("sdfgdgfwresdf9123sdf"));

    }


}
