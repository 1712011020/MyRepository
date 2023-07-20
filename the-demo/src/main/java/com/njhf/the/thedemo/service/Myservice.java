package com.njhf.the.thedemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njhf.the.thedemo.bean.PageVo;
import com.njhf.the.thedemo.bean.User;
import com.njhf.the.thedemo.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Myservice {
    @Resource
    UserMapper userMapper;
    public List<User> queryUserList(PageVo pageVo){
        PageVo pageVo1 = new PageVo(pageVo.getPageNum(),pageVo.getPageSize());
        PageHelper.startPage(pageVo1.getPageNum(),pageVo1.getPageSize());
        List<User> users = userMapper.queryUserList();
        PageInfo<User> pageInfo=new PageInfo<>(users);
        System.out.println("--------------------");
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        return users;
    }
}
