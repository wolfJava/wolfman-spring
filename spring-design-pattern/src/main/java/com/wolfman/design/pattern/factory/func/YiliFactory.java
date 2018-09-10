package com.wolfman.design.pattern.factory.func;

import com.wolfman.design.pattern.factory.Milk;
import com.wolfman.design.pattern.factory.Yili;

public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }

}
