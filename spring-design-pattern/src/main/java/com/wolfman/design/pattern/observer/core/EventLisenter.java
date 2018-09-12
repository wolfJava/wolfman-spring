package com.wolfman.design.pattern.observer.core;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 */
public class EventLisenter {

    //map相当于一个注册器
    protected Map<Enum, Event> events = new HashMap<>();

    //添加监听
    public void addLisenter(Enum evenType , Object target , Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(evenType,new Event(target,callback));

    }

    //trigger：触发
    private void trigger(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }
    }


    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return ;}
        trigger(this.events.get(call).setTrigger(call.toString()));
    }



}
