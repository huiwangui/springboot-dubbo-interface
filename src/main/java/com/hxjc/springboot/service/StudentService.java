package com.hxjc.springboot.service;

import com.hxjc.springboot.model.Student;
import com.hxyc.common.page.PageResult;
import com.hxyc.common.page.Paginator;

/**
 * creater: 13116
 * create time: 2019/10/11
 * describe:
 */
public interface StudentService {

    /**
     *
     * @param student
     * @param paginator 排序 具体使用：orderSegment =  student类中需要排序的字段.desc/asc
     *                  eg:http://localhost:9090/boot/student?orderSegment=age.desc
     * @return
     */
    public PageResult<Student> listStudentByCon(Student student , Paginator paginator);
}
