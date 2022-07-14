package com.zlt.healthypass.service;

import com.zlt.healthypass.bean.Info;
import com.zlt.healthypass.bean.Location;
import com.zlt.healthypass.bean.UserInfo;

public interface IUserInfoService {
    //通过昵称查询个人信息
    UserInfo selectUserInfoByNickname(String nickname);
    //通过昵称查询二维码状态
    Info selectHealthyStatusByNickname(String nickname);
    //提交扫码信息
    int insertLocationCode(Location location);

}
