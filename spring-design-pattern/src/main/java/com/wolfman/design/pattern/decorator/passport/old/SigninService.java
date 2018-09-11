package com.wolfman.design.pattern.decorator.passport.old;

import com.wolfman.design.pattern.adapter.Member;
import com.wolfman.design.pattern.adapter.ResultMsg;

public class SigninService implements ISignInService {

    @Override
    public ResultMsg regist(String username, String password) {
        return  new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
