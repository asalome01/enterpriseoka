package com.ti.enterprise.dao;

import java.util.ArrayList;
import java.util.List;

import com.ti.enterprise.entity.Employee;

public class Employees 
{
    private List<Employee> employeeList;
     
    public List<Employee> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
  
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
