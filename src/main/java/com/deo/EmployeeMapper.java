package com.deo;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.entity.Employee;
import org.springframework.jdbc.core.RowMapper;
public class EmployeeMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet rs, int rows) throws SQLException {
        Employee emp = new Employee();

        emp.setEmpId(rs.getInt("empId"));
        emp.setEmpName(rs.getString("empName"));
        emp.setEmpCity(rs.getString("empCity"));
        emp.setEmpAge(rs.getInt("empAge"));
        emp.setEmpDept(rs.getString("empDept"));
        return emp;
    }
}
