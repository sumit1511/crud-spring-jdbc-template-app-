package com.deo;

import com.entity.Employee;

import java.util.List;

public interface EmployeeOperation
{
      public Employee save(Employee employee);
      public String delete(String empId);
      public List<Employee> show();
      public Employee update(String empId,Employee employee);
}
