package com.wolfman.design.pattern.strategy.payport;

public enum  PayType {

    ALI_PAY(new Alipay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
