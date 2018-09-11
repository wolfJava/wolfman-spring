package com.wolfman.design.pattern.decorator.passport.upgrede;

import com.wolfman.design.pattern.adapter.ResultMsg;
import com.wolfman.design.pattern.decorator.passport.old.ISignInService;

public interface ISigninForThirdService extends ISignInService {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegist(String username,String password);

}
