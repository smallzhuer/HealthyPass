package com.zlt.healthypass.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
@ApiModel(value = "用户信息对象",description = "返回用户信息")
public class UserInfo {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("姓名")
    private String nickname;
    @ApiModelProperty("身份证号")
    private String idCard;
    @ApiModelProperty("健康状态")
    private int healthStatus;

    public UserInfo() {
    }

    public UserInfo(Integer id, String nickname, String idCard) {
        this.id = id;
        this.nickname = nickname;
        this.idCard = idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
