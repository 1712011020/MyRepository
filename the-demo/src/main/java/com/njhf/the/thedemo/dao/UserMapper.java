package com.njhf.the.thedemo.dao;

import com.njhf.the.thedemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();

}
