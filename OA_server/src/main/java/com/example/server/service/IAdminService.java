package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Admin;
import com.example.server.pojo.Menu;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.Role;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */


//@Component


public interface IAdminService extends IService<Admin> {


    //登录之后返回token

    RespBean login(String username, String password, String code, HttpServletRequest request);




    //根据用户名获取用户
    Admin getAdminByUserName(String username);


    //根据用户id查询角色
    List<Role> getRole(Integer adminId);


    //获取所有操作员
    List<Admin> getAllAdmin(String keywords);

    //更新操作员角色
    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
