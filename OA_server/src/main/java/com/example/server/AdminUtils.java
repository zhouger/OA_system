package com.example.server;

import com.example.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author cjz
 * @date 2023/4/16 14:59
 * @description:操作员工具类
 */


public class AdminUtils {

    //获取当前登录操作员
    public static Admin getCurrentAdmin()
    {
        return (Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
