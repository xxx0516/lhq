package com.emp.controller;

import com.emp.pojo.Employee;
import com.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
    @Autowired
    EmpService empService;
    public ModelAndView Login(@RequestParam("admmin") String name ,@RequestParam("password") String password){


        ModelAndView mv=new ModelAndView();
        Employee employee=empService.login(name,password);

        if(employee!=null){

            mv.setViewName("redirect:#");
return  mv;

        }
        mv.setViewName("login");

        mv.addObject("#","登录失败");
        return mv;
    }


}
