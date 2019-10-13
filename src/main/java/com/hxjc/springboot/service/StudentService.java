package com.hxjc.springboot.service;

import com.hxjc.springboot.model.Student;

/**
 * creater: 13116
 * create time: 2019/10/11
 * describe:
 */
public interface StudentService {
    public String sayHi(String name);

    public Student getStudent(int id);
}
