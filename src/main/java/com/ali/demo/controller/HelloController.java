package com.ali.demo.controller;

import com.ali.demo.Pojo.People;
import com.ali.demo.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    PeopleMapper peopleMapper;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        List<People> select = peopleMapper.select();
        return "hello";
    }

    @RequestMapping("/test2")
    public String test2(){
        String str = "what your name?";
        String str1 = "my name is liHua";
        return str+" "+str1;
    }

    @RequestMapping("toHello")
    public String toHello(){
        return "index";
    }
}
