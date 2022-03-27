package com.emp.serviceimpl;

import com.emp.dao.EmployeeDao;
import com.emp.pojo.Employee;
import com.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmployeeDao employeeDao;



    @Override
    public Employee login(String name, String password) {
        return employeeDao.getEmpByNameAndPwd(name,password);
    }
}
