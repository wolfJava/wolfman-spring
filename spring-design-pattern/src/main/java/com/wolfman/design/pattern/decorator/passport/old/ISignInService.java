package com.wolfman.design.pattern.decorator.passport.old;

import com.wolfman.design.pattern.adapter.ResultMsg;

public interface ISignInService {

    //注册方法
    public ResultMsg regist(String username,String password);

    //登录方法
    public ResultMsg login(String username, String password);

}
