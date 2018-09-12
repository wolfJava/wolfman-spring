package com.wolfman.design.pattern.observer.mouse;

import com.wolfman.design.pattern.observer.core.Event;

import java.lang.reflect.Method;

public class MouseEventTest {

    public static void main(String[] args) throws NoSuchMethodException {


        //观察者与被观察者之间没有必然联系
        //注册的时候，才产生联系

        MouseEventCallback mouseEventCallback = new MouseEventCallback();

        Method method = mouseEventCallback.getClass().getMethod("onClick", Event.class);

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK,mouseEventCallback,method);

        mouse.click();









    }


}
