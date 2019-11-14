package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserDao extends JpaRepository<SysUser, Integer> {
}
