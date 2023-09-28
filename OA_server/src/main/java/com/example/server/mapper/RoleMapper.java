package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.Role;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface RoleMapper extends BaseMapper<Role> {

    //根据用户id查询角色列表
    List<Role> getRole(Integer adminId);
}
