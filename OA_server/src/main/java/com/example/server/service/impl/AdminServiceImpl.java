package com.example.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.server.AdminUtils;
import com.example.server.mapper.AdminMapper;
import com.example.server.mapper.AdminRoleMapper;
import com.example.server.mapper.RoleMapper;
import com.example.server.pojo.Admin;
import com.example.server.config.security.component.JwtTokenUtil;
import com.example.server.pojo.AdminRole;
import com.example.server.pojo.RespBean;
import com.example.server.pojo.Role;
import com.example.server.service.IAdminService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author c
 * @since 2023-03-30
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {


    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;//加密密码工具

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Value("${jwt.tokenHead}")
    private String tokenHead;


    //登录之后返回token


    public RespBean login(String username, String password, String code, HttpServletRequest request) {
        //验证码校验
        String captcha = (String)request.getSession().getAttribute("captcha");
        //判空+忽略大小写
        if (StringUtils.isEmptyOrWhitespaceOnly(captcha)||!captcha.equalsIgnoreCase(code))
        {
            return RespBean.error("验证码输入错误，重新输入");
        }


        //登录
         UserDetails userDetails = userDetailsService.loadUserByUsername(username);
         if (null==userDetails||!passwordEncoder.matches(password,userDetails.getPassword()))
         {
             return RespBean.error("用户名或密码不正确");
         }
         if (!userDetails.isEnabled())
         {
             return RespBean.error("账号被禁用，请联系管理员");
         }
         //更新security登录用户对象
        UsernamePasswordAuthenticationToken authenticationToken=new
                UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

         //生成token
         String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,String> tokenMap=new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);


        return RespBean.success("登录成功",tokenMap);
    }



    public  Admin getAdminByUserName(String username)
    {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",username)
                .eq("enabled",true));
    }


    //根据角色id查询角色列表
    @Override
    public List<Role> getRole(Integer adminId) {
        return roleMapper.getRole(adminId);

    }



    //获取所有操作员
    @Override
    public List<Admin> getAllAdmin(String keywords) {


        return adminMapper.getAllAdmin(AdminUtils.getCurrentAdmin().getId(),keywords);
    }


    //更新操作员角色
    @Override
    @Transactional
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {

        //删除在添加
        adminRoleMapper.delete(new QueryWrapper<AdminRole>().eq("adminId",adminId));
        Integer result= adminRoleMapper.addAdminRole(adminId,rids);

       //受影响行数一样则成功
       if (rids.length==result)
       {
            return RespBean.success("更新成功");
       }
        return RespBean.error("更新失败");
    }


}
