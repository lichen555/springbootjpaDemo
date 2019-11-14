package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.SysUser;

import java.util.List;

public interface ISysUserService {

    List<SysUser> findAll();

}
