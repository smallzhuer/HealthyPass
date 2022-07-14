package com.zlt.healthypass.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "场所信息对象",description = "返回场所信息")
public class Location {
    @ApiModelProperty("用户id")
    private int userId;
    @ApiModelProperty("场所名")
    private String locationName;
    @ApiModelProperty("扫码时间")
    private Date date;

    public Location() {
    }

    public Location(int userId, String locationName, Date date) {
        this.userId = userId;
        this.locationName = locationName;
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Location{" +
                "userId=" + userId +
                ", locationName='" + locationName + '\'' +
                ", date=" + date +
                '}';
    }
}
