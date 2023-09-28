package com.example.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cjz
 * @date 2023/4/17 9:26
 * @description:分页公共返回对象
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    //总条数
    private Long total;
    //数据
    private List<?> data;


}
