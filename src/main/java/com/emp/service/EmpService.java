package com.emp.service;

import com.emp.pojo.Employee;

public interface EmpService {

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    Employee login (String name,String password);
}
