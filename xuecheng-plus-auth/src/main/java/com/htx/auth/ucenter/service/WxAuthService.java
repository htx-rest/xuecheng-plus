package com.htx.auth.ucenter.service;

import com.htx.auth.ucenter.model.po.XcUser;

/**
 * 微信扫码接入
 */
public interface WxAuthService {

 /**
  *  微信扫码认证，申请令牌，携带令牌查询用户信息、保存用户信息到数据库
  * @param code 授权码
  * @return
  */
 XcUser wxAuth(String code);
}
