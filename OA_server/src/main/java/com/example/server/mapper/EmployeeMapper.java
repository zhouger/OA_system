package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.server.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface EmployeeMapper extends BaseMapper<Employee> {


    //获取所有员工(分页)
    IPage<Employee> getEmployeeByPage(Page<Employee> page,
                                      @Param("employee") Employee employee,
                                      @Param("beginDateScope") LocalDate[] beginDateScope);


    //查询员工
    List<Employee> getEmployee(Integer id);
}
