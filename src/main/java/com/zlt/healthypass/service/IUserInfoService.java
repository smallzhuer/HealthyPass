package com.zlt.healthypass.service;

import com.zlt.healthypass.bean.Info;
import com.zlt.healthypass.bean.UserInfo;
import org.springframework.stereotype.Service;

public interface IUserInfoService {
    UserInfo selectUserInfoByNickname(String nickname);

    Info selectHealthyStatusByNickname(String nickname);
}
