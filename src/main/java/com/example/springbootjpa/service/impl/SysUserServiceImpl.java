package com.example.springbootjpa.service.impl;

import com.example.springbootjpa.dao.SysUserDao;
import com.example.springbootjpa.dao.UserTypeDao;
import com.example.springbootjpa.entity.SysUser;
import com.example.springbootjpa.entity.UserType;
import com.example.springbootjpa.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserDao sysUserDao;

    @Autowired
    UserTypeDao userTypeDao;

    @Override
    public List<SysUser> findAll() {
        List<SysUser> sysUserList = sysUserDao.findAll();
        for (SysUser sysUser : sysUserList) {
            Integer userType = sysUser.getUserType();
            UserType userTypeById = userTypeDao.findUserTypeById(userType);
            sysUser.setType(userTypeById.getType());
        }
        return sysUserDao.findAll();
    }
}
