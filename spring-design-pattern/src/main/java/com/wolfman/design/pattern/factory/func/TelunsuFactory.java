package com.wolfman.design.pattern.factory.func;

import com.wolfman.design.pattern.factory.Milk;
import com.wolfman.design.pattern.factory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
