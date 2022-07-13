package com.zlt.healthypass.service.Impl;

import com.zlt.healthypass.bean.UserInfo;
import com.zlt.healthypass.bean.Info;
import com.zlt.healthypass.dao.IUserInfoDao;
import com.zlt.healthypass.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements IUserInfoService {

    @Autowired
    private IUserInfoDao iuid;


    @Override
    public UserInfo selectUserInfoByNickname(String nickname) {
        UserInfo userInfo = iuid.selectUserInfoByNickname(nickname);
        return userInfo;
    }

    @Override
    public Info selectHealthyStatusByNickname(String nickname) {
        int i = iuid.selectHealthyStatusByNickname(nickname);
        Info info = new Info(200, "成功了", i);
        return info;
    }
}
