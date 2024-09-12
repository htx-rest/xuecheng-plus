package com.htx.auth.ucenter.service;

import com.htx.auth.ucenter.model.dto.AuthParamsDto;
import com.htx.auth.ucenter.model.dto.XcUserExt;

/**
 * 统一的认证接口
 */
public interface AuthService {

 /**
  * @description 认证方法
  * @param authParamsDto 认证参数
  * @return com.xuecheng.ucenter.model.po.XcUser 用户信息
  */
 XcUserExt execute(AuthParamsDto authParamsDto);

}
