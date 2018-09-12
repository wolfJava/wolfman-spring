package com.wolfman.design.pattern.observer.subject;

import com.wolfman.design.pattern.observer.core.EventLisenter;

public class Subject extends EventLisenter {

    //通常的话，采用动态里来实现监控，避免了代码侵入
    public void add(){
        System.out.println("调用添加方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用删除方法");
        trigger(SubjectEventType.ON_RMOVE);
    }

}
