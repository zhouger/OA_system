package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author c
 * @since 2023-04-07
 */
public interface MenuMapper extends BaseMapper<Menu> {


    //id查询列表
    List<Menu> getMenusByAdminId(Integer id);
    //角色查询列表
    List<Menu> getMenusWithRole();

    //查询所有菜单
    List<Menu> getAllMenus();
}
