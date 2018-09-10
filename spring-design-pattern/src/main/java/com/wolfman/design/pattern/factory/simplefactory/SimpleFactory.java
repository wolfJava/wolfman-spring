package com.wolfman.design.pattern.factory.simplefactory;

import com.wolfman.design.pattern.factory.Mengniu;
import com.wolfman.design.pattern.factory.Milk;
import com.wolfman.design.pattern.factory.Telunsu;
import com.wolfman.design.pattern.factory.Yili;

public class SimpleFactory {

    public Milk getMilk(String name){
        if ("特仑苏".equals(name)){
            return new Telunsu();
        }else if ("蒙牛".equals(name)){
            return new Mengniu();
        }else if ("伊利".equals(name)){
            return new Yili();
        }else {
            System.out.println("不能生产您所需的产品");
            return null;
        }
    }
}
