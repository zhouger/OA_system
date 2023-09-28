package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Employee;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
public interface IEmployeeService extends IService<Employee> {


    //获取所有员工(分页)
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    //获取工号
    RespBean maxWorkID();


    //添加员工
    RespBean addEmp(Employee employee);


    //查询员工
    List<Employee> getEmployee(Integer id);
}
