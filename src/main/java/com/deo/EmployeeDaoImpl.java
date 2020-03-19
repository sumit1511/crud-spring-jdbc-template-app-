package com.deo;

import com.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeOperation {

    private JdbcTemplate jdbcTemplateObject;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplateObject = template;
    }
    @Override
    public Employee save(Employee employee) {
        String sql = "INSERT INTO employeeTable(empName,empCity,empAge,empDept)VALUES(?,?,?,?)";
        jdbcTemplateObject.update(sql, employee.getEmpName(), employee.getEmpCity(), employee.getEmpAge(),
                employee.getEmpDept());
        return employee;
    }

    @Override
    public String delete(String empId) {
        String sql = "delete from employeeTable where empId = ?";
        jdbcTemplateObject.update(sql, empId);
        return "success";
    }

    @Override
    public List<Employee> show() {
        String sql = "select * from employeeTable";
        List<Employee> list = jdbcTemplateObject.query(sql, new EmployeeMapper());
        return list;
    }

    @Override
    public Employee update(String empId,Employee employee) {
        //
        String sql = "update employeeTable set empName = ? where empId= ?";
        jdbcTemplateObject.update(sql, employee.getEmpName(),empId);
        return employee;
    }
}
