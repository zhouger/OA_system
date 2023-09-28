package com.example.server.controller;


import com.example.server.pojo.Joblevel;
import com.example.server.pojo.RespBean;
import com.example.server.service.IJoblevelService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
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
@RequestMapping("/system/basic/joblevel")
public class JoblevelController {

    @Autowired
    private IJoblevelService joblevelService;


    @ApiOperation(value = "获取所有职称")
    @GetMapping("/")
    public List<Joblevel> getAllJoblevels()
    {
        return joblevelService.list();
    }


    @ApiOperation(value = "添加职称")
    @PostMapping("/")
    public RespBean addJoblevels(@RequestBody Joblevel joblevel)
    {
        joblevel.setCreateDate(LocalDateTime.now());
        if (joblevelService.save(joblevel))
        {
           return RespBean.success("添加职称成功");
        }
        return RespBean.error("添加失败");
    }


    @ApiOperation(value = "更新职称")
    @PutMapping("/")
    public RespBean updateJobleves(@RequestBody Joblevel joblevel)
    {
        if (joblevelService.updateById(joblevel))
        {
            return RespBean.success("更新职称成功");
        }
        return RespBean.error("更新失败");
    }



    @ApiOperation(value = "删除职称信息")
    @DeleteMapping("/{id}")
    public RespBean deleteJobleves(@PathVariable Integer id)
    {
        if (joblevelService.removeById(id))
        {
           return RespBean.success("删除职位成功");
        }
        return RespBean.error("删除失败");
    }



    @ApiOperation(value = "批量删除职称")
    @DeleteMapping("/")
    public RespBean deleteJoblevesByIds( Integer[] ids)
    {
        if (joblevelService.removeByIds(Arrays.asList(ids)))
        {
            return RespBean.success("删除成功");
        }
        return  RespBean.error("删除失败");
    }



}
