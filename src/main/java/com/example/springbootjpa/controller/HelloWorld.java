package com.example.springbootjpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    /*
        value 表示方法的访问路径。
        method 表示restful风格，指定get请求方式时，post方式时请求不到的。
        @RequestMapping（ "/hello"） 只定义请求路径
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "helloWorld";
    }

//    @RequestMapping的value可以指定多个，用{"",""}
//    @RequestParam的value 指定获取url路径的参数,requird = true 表示必传项
//    @RequestMapping(value = {"/test1","/test2"},method = RequestMethod.GET)
    public String test(@RequestParam(value = "person" , required = false)String personName){
        return "test helloWorld"+personName;
    }

//    没有@RequestParam指定value时，URL参数名必须和方法参数名一致
    @RequestMapping(value = {"/getName","/getName2"},method = RequestMethod.GET)
    public String getName(String personName){
        return "getName"+personName;
    }

}
