package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.SysUser;
import com.example.springbootjpa.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    @RequestMapping(value = "/getSysUser" ,method = RequestMethod.GET)
    @ResponseBody
    public List<SysUser> getSysUser(){
        List<SysUser> list = iSysUserService.findAll();
        return list;
    }

}
