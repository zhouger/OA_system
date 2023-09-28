package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.Admin;
import com.example.server.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */

//@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

    //List<Admin> GetAdminAll();



    //获取所有操作员
    List<Admin> getAllAdmin(@Param("id") Integer id, @Param("keywords") String keywords);
}
