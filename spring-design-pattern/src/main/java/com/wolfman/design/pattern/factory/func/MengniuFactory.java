package com.wolfman.design.pattern.factory.func;

import com.wolfman.design.pattern.factory.Mengniu;
import com.wolfman.design.pattern.factory.Milk;

public class MengniuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }

}
