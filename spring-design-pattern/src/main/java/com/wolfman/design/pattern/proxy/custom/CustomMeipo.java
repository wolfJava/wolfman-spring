package com.wolfman.design.pattern.proxy.custom;

import com.wolfman.design.pattern.proxy.staticed.Person;

import java.lang.reflect.Method;

public class CustomMeipo implements CustomInvocationHandler {

    private Person target;

    public Object getInstance(Person target) throws Exception{

        this.target = target;

        Class<?> clazz = target.getClass();

        return CustomProxy.newProxyInstance(new CustomClassLoader(),clazz.getInterfaces(),this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");

        method.invoke(this.target,args);

        System.out.println("如果合适的话，就准备办事");

        return  null;
    }

}
