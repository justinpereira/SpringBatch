package com.javacodingskills.spring.batch.demo3.mapper;

import com.javacodingskills.spring.batch.demo3.model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class EmployeeDBRowMapper implements RowMapper<Employee> {


    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getString("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setEmail(resultSet.getString("email"));
        employee.setAge(resultSet.getInt("age"));
        return employee;
    }
}
