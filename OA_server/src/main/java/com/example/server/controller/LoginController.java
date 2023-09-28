package com.example.server.controller;


//登录controller


import com.example.server.pojo.Admin;
import com.example.server.pojo.AdminLoginParam;
import com.example.server.pojo.RespBean;
import com.example.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request)
    {
        System.out.println("当前登录用户为："+adminLoginParam.getUsername());
        System.out.println("登录密码为："+adminLoginParam.getPassword());
        System.out.println("用户输入验证码"+adminLoginParam.getCode());


        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),adminLoginParam.getCode(),request);

    }

    @ApiOperation(value = "获取当前用户登录信息")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal)
    {
        if (null==principal)
        {
            return null;
        }
         String username = principal.getName();
         Admin admin= adminService.getAdminByUserName(username);
         admin.setPassword(null);
         //获取用户id返回用户角色
         admin.setRoles(adminService.getRole(admin.getId()));
         return admin;
    }


    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout()
    {
        return RespBean.success("退出登录");
    }


}
