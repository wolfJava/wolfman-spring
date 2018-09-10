package com.wolfman.design.pattern.factory.abstr;

import com.wolfman.design.pattern.factory.Mengniu;
import com.wolfman.design.pattern.factory.Milk;
import com.wolfman.design.pattern.factory.Telunsu;
import com.wolfman.design.pattern.factory.Yili;

public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
