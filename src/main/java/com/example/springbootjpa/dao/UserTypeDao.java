package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeDao extends JpaRepository<UserType, Integer> {

    UserType findUserTypeById(Integer id);

}
