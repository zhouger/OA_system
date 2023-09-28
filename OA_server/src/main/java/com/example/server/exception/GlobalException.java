package com.example.server.exception;

import com.example.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author cjz
 * @date 2023/4/12 23:56
 * @description:全局异常处理
 */

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public RespBean mysqlException(SQLException e)
    {

        if (e instanceof SQLIntegrityConstraintViolationException)
        {
            return RespBean.error("该数据有关联数据,操作失败！");
        }
        return RespBean.error("数据库异常,操作失败");
    }


}
