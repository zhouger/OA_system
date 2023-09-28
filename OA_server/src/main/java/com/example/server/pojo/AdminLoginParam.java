package com.example.server.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.web.bind.annotation.RequestParam;

//用户登录实体类
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "AdminLogin对象",description = "")//swagger文档

public class AdminLoginParam {

    @ApiModelProperty(value = "用户名",required = true)  //api文档用户名，必填项
    private String username;


    @ApiModelProperty(value = "密码",required = true)
    private String password;

    @JsonProperty("captcha")
    @ApiModelProperty(value = "验证码",required = true)
    private String code;


}
