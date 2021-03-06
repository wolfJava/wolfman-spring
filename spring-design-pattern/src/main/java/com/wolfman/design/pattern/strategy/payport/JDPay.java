package com.wolfman.design.pattern.strategy.payport;

import com.wolfman.design.pattern.strategy.PayState;

public class JDPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用京东白条");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,amount,"支付成功");

    }
}
