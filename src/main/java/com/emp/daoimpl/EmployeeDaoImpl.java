package com.emp.daoimpl;

import com.alibaba.fastjson.JSON;
import com.emp.configer.RedisTableConf;
import com.emp.dao.EmployeeDao;
import com.emp.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {



    @Autowired
    JedisPool jedisPool;


    @Override
    public List<Employee> getAllEmp() {
        return null;
    }

    @Override
    public Employee getEmpByNameAndPwd(String name, String password) {
        Jedis jedis = jedisPool.getResource();


        List<String> lrange = jedis.lrange(RedisTableConf.EMP_TABLE_NAME, 0, -1);
        for (String s : lrange) {
            Employee employee = JSON.parseObject(s, Employee.class);
            if (employee.getName().equals(name) && employee.getPassword().equals(password)) {
                return employee;
            }
        }

            return null;
    }

    }