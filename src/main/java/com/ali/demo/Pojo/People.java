package com.ali.demo.Pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class People {
    private int id;
    private String name;
    private Double height;
    private Integer age;
    private String job;
    private Integer sex;
}
