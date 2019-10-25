package com.ali.demo.mapper;

import com.ali.demo.Pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PeopleMapper {

    @Select("select * from people")
    List<People> select();
}
