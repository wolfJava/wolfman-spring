package com.wolfman.design.pattern.adapter.passPort;

import com.wolfman.design.pattern.adapter.Member;
import com.wolfman.design.pattern.adapter.ResultMsg;

public class SiginService {

    //注册方法
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    //登录方法
    public ResultMsg login(String username,String password){
        return null;
    }


}
