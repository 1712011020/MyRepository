package com.njhf.the.thedemo.controller;

import com.njhf.the.thedemo.bean.PageVo;
import com.njhf.the.thedemo.bean.User;
import com.njhf.the.thedemo.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {

    @Autowired
    private Myservice myservice;

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    @ResponseBody
    public List<User> queryUserList(PageVo pageVo){
        List<User> users = myservice.queryUserList(pageVo);
        return users;
    }

}
