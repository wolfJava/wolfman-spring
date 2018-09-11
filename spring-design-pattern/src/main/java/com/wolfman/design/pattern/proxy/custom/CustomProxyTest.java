package com.wolfman.design.pattern.proxy.custom;

import com.wolfman.design.pattern.proxy.jdk.JDKHuhao;
import com.wolfman.design.pattern.proxy.jdk.JDKMeipo;
import com.wolfman.design.pattern.proxy.staticed.Person;
import com.wolfman.design.pattern.proxy.staticed.Son;

/**
 * 基于JDK实现的简版动态代理
 */
public class CustomProxyTest {

    public static void main(String[] args) throws Exception {
        Person obj = (Person) new CustomMeipo().getInstance(new JDKHuhao());
        System.out.println(obj.getClass());
        obj.findlove();

    }

}
