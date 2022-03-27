package com.emp.dao;

import com.emp.pojo.Employee;

import java.util.List;

public interface EmployeeDao {

    /**
     * 查询所有员工
     */
    public List<Employee> getAllEmp();


    /**
     * 查询用户名和密码
     */
    Employee getEmpByNameAndPwd(String name,String password);

}
