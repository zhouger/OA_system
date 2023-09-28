package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Department;
import com.example.server.pojo.RespBean;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface IDepartmentService extends IService<Department> {


    //获取所有部门
    List<Department> getAllDepartments();



    //添加部门
    RespBean addDep(Department dep);


    //删除部门
    RespBean deleteDep(Integer id);
}
