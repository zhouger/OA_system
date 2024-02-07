package com.example.server.controller;


import com.example.server.pojo.RespBean;
import com.example.server.pojo.Salary;
import com.example.server.service.ISalaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {

    @Autowired
    private ISalaryService salaryService;


    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/getAllSalaries")
    //获取所有工资账套
    public List<Salary> getAllSalaries()
    {
        return salaryService.list();
    }


    @ApiOperation(value = "添加员工账套")
    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary)
    {
        salary.setCreateDate(LocalDateTime.now());//设置创建时间
        if (salaryService.save(salary))
        {
            return RespBean.success("添加成功");
        }else
        {
            return RespBean.error("添加失败，请重试");
        }

    }

    @ApiOperation(value = "删除工资账套")
    @DeleteMapping("/{id}")
    //根据前端传入id删除工资账套
    public RespBean deleteSalary(@PathVariable Integer id)
    {
        if (salaryService.removeById(id))
        {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @ApiOperation(value = "更新工资账套")
    @PutMapping("/")
    public RespBean updateSalary(@RequestBody Salary salary)
    {
        if (salaryService.updateById(salary))
        {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }


}
