package com.controller;

import com.deo.EmployeeDaoImpl;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/")
public class DbQueries {
   private    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoImpl getEmployeeDaoImpl() {
        return employeeDaoImpl;
    }

    public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @PostMapping("/employees")
    public Employee post(@RequestBody Employee employee)
    {
        employeeDaoImpl.save(employee);
        return employee;
    }
    @GetMapping("/employees")
    public List<Employee> get()
    {
        return employeeDaoImpl.show();
    }
    @DeleteMapping(value = "/employees/{empId}")
    public String delete(@PathVariable String empId)
    {
        return employeeDaoImpl.delete(empId);
    }
    @PutMapping(value = "/employees/{empId}")
    public Employee put(@PathVariable String empId,@RequestBody Employee employee)
    {
        return employeeDaoImpl.update(empId,employee);
    }

}
