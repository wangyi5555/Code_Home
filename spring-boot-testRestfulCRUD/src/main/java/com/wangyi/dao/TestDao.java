package com.wangyi.dao;

import com.wangyi.pojo.Employee;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TestDao {
    private static Map<Integer,Employee> employeeList;
    private static List<String> departmentList;
    private static int nextid=1004;
    static {
        employeeList = new HashMap<>();
        departmentList = new ArrayList<>();
        departmentList.add("B-1");
        departmentList.add("A-1");
        departmentList.add("B-2");
        employeeList.put(1001,new Employee(1001,"zhangsan",0,new Date(),"B-1"));
        employeeList.put(1002,new Employee(1002,"lisi",1,new Date(),"A-1"));
        employeeList.put(1003,new Employee(1003,"wangwu",0,new Date(),"B-2"));
    }
    /*
    * 查询所有部门*/
    public List<String> selectDepartment(){
        return departmentList;
    }
    /*
    * 查询所有员工*/
    public Collection<Employee> selectEmployee() {
        return employeeList.values();
    }
    /*
    * 查询指定员工*/
    public Employee selectEmployee(int id){
        return employeeList.get(id);
    }
    /*
    * 保存员工*/
    public void saveEmployee(Employee employee){
        if (employee.getId()==null) {
            employee.setId(nextid++);
        }
        employeeList.put(employee.getId(), employee);
    }

    public void deleteEmployee(int id){
        employeeList.remove(id);
    }
}
