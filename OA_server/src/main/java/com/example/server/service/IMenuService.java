package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author c
 * @since 2023-04-07
 */
public interface IMenuService extends IService<Menu> {

    //根据用户id查询菜单列表
    List<Menu> getMenusByAdminId();
    //根据用户角色查询菜单列表
    List<Menu> getMenusWithRole();

    //查询所有菜单
    List<Menu> getAllMenus();
}
