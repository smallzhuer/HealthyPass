package com.zlt.healthypass.dao;

import com.zlt.healthypass.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IUserInfoDao {

    @Select("select uname,id_card from users where uname=#{nickname}")
    @Results({
            @Result(column = "uname",property = "nickname"),
            @Result(column = "id_card",property = "idCard")
    })
    UserInfo selectUserInfoByNickname(String nickname);

    @Select("select health_status from users where uname=#{nickname}")
    int selectHealthyStatusByNickname(String nickname);
}
