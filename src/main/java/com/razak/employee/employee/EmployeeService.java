package com.razak.employee.employee;

import java.util.List;

public interface EmployeeService
{
    Employee save(Employee employee);
    List<Employee> findAllEmployees();
    Employee findByEmail(String email);
    Employee update(Employee employee);
    void delete(int Id);
}
