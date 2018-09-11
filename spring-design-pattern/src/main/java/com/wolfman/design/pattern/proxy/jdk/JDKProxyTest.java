package com.wolfman.design.pattern.proxy.jdk;

import com.wolfman.design.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) throws Exception {

        Person obj = (Person) new JDKMeipo().getInstance(new JDKHuhao());
        System.out.println(obj.getClass());
        obj.findlove();

        /**
         * 原理：
         *  1.拿到被代理对象的引用，并且获取到他的所有的接口，反射获取
         *  2.JDK Proxy 类重新生成一个新的类，同时新的类要实现被代理类的所实现的所有的接口
         *  3.动态生成java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
         *  4.编译新生成的java代码.class
         *  5.再重新加载到JVM中运行
         *  以上这个过程就叫字节码重组
         *
         *  JDK中有一个规范，只要是$开头的一半都是自动生成的
         *
         */

        //通过反编译工具可以查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream out = new FileOutputStream("/Users/User/$Proxy0.class");
        out.write(bytes);
        out.close();





        Person obj2 = (Person) new JDK58().getInstance(new JDKHuhao());
        System.out.println(obj2.getClass());
        obj2.findJob();


    }



}
