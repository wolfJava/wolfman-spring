package com.wolfman.design.pattern.observer.subject;

import com.wolfman.design.pattern.adapter.Member;
import com.wolfman.design.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class ObserverTest {


    public static void main(String[] args) throws NoSuchMethodException {

        //观察者
        Observer observer = new Observer();

        Method advice = Observer.class.getMethod("advice",new Class<?>[]{Event.class});


        Subject subject = new Subject();

        subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);
        subject.addLisenter(SubjectEventType.ON_EDIT,observer,advice);
        subject.addLisenter(SubjectEventType.ON_QUERY,observer,advice);
        subject.addLisenter(SubjectEventType.ON_RMOVE,observer,advice);

        subject.add();
        subject.remove();

    }






}
