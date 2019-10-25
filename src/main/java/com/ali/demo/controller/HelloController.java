package com.ali.demo.controller;

import com.ali.demo.Pojo.People;
import com.ali.demo.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    PeopleMapper peopleMapper;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public List<People> test(){
        List<People> select = peopleMapper.select();

        return select;
    }
}
