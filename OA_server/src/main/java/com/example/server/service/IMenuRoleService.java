package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.MenuRole;
import com.example.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface IMenuRoleService extends IService<MenuRole> {


    //更新角色菜单
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
