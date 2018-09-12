package com.wolfman.design.pattern.strategy.payport;

import com.wolfman.design.pattern.strategy.PayState;

/**
 * 支付渠道
 */
public interface Payment {

    /**
     * 支付
     * @param uid
     * @param amount
     * @return
     */
    public PayState pay(String uid, double amount);



}
