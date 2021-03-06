package com.zlt.healthypass.controller;

import com.zlt.healthypass.bean.Info;
import com.zlt.healthypass.bean.Location;
import com.zlt.healthypass.bean.UserInfo;
import com.zlt.healthypass.service.IUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Api(tags = "健康通信息获取")
@Controller
public class ScanQRCodeController {

    @Autowired
    private IUserInfoService iis;


    @ApiOperation(value = "获取用户信息",notes="传入昵称获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nickname",value = "昵称",paramType = "query",example = "张三",required = true)
    })
    @GetMapping("/getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo(String nickname){
        UserInfo userInfo = iis.selectUserInfoByNickname(nickname);
        return userInfo;
    }

    @ApiOperation(value = "获取用户健康状态",notes="传入昵称获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nickname",value = "昵称",paramType = "query",example = "张三",required = true)
    })
    @GetMapping("/getUserHealthStatus")
    @ResponseBody
    public Info getUserHealthStatus(String nickname){
        Info info = iis.selectHealthyStatusByNickname(nickname);
        return info;
    }

    @ApiOperation(value = "提交扫码信息的接口",notes="传入id和场所信息")
    @PostMapping("/postLocation")
    @ResponseBody
    public int postLocationCode(@RequestBody Location location) {
        location.setDate(new Date());
        int i = iis.insertLocationCode(location);
        return i;
    }


}
