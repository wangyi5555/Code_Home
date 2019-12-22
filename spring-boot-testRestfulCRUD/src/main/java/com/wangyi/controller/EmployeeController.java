package com.wangyi.controller;

import com.wangyi.dao.TestDao;
import com.wangyi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;

@Controller
@RequestMapping("/employeeManager")
public class EmployeeController {
    @Autowired
    private TestDao testDao;

    @GetMapping("/showempls")
    private ModelAndView showallempls(){
        ModelAndView modelAndView = new ModelAndView("/login/employee");
        Collection<Employee> list =new ArrayList<>();
        list = testDao.selectEmployee();
        modelAndView.addObject("employeelist",list);
        return modelAndView;
    }
    @GetMapping("/addpage")
    private ModelAndView addpage(){
        ModelAndView modelAndView = new ModelAndView("/login/operateEmployee");
        modelAndView.addObject("department",testDao.selectDepartment());
        return modelAndView;
    }

    @PostMapping("/addemp")
    private ModelAndView addemp(Employee e){
        ModelAndView modelAndView = new ModelAndView("redirect:/employeeManager/showempls");
        System.out.println(e);
        testDao.saveEmployee(e);
        return modelAndView;
    }

    @GetMapping("/updatepage/{id}")
    public ModelAndView updatepage(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("/login/operateEmployee");
        modelAndView.addObject("employee", testDao.selectEmployee(id));
        modelAndView.addObject("department",testDao.selectDepartment());
        return modelAndView;
    }

    @PutMapping("updemp")
    public ModelAndView update(Employee e){
        ModelAndView modelAndView = new ModelAndView("redirect:/employeeManager/showempls");
        System.out.println(e);
        testDao.saveEmployee(e);
        return modelAndView;
    }

    @DeleteMapping("delemp/{id}")
    public ModelAndView deleteemp(@PathVariable("id")Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/employeeManager/showempls");
        testDao.deleteEmployee(id);
        return modelAndView;
    }
}
