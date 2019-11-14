package com.example.springbootjpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity//告诉jpa这是一个实体类（和数据库映射表）
@Table( name = "sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id//主键
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "name") //和数据库对应的字段
    private String name;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private Integer age;

    @Column(name = "user_type")
    private Integer userType;

    @Transient//此字段非数据库字段
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
