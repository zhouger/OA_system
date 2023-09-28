package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {


    //更新角色菜单
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
