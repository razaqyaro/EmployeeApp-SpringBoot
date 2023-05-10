package com.razak.employee.employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeDao
{
    private final List<Employee> EMPLOYEES = new ArrayList<>();

    public List<Employee> findByStudents()
    {
        return EMPLOYEES;
    }

    public Employee save(Employee employee)
    {
        EMPLOYEES.add(employee);
        return employee;
    }

    public Employee findById(int Id)
    {
        return EMPLOYEES.stream()
                .filter(employee -> employee.getId() == Id)
                .findFirst()
                .orElse(null);
    }
}
