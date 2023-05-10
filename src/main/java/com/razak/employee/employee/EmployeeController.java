package com.razak.employee.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController
{
    private EmployeeService service;
    public EmployeeController(EmployeeService service)
    {
        this.service = service;
    }
    @PostMapping
    public Employee save(@RequestBody Employee employee)
    {
        return service.save(employee);
    }
    @GetMapping
    public List<Employee> findAllEmployees() {
        return service.findAllEmployees();
    }
    @GetMapping("/{email}")
    public Employee findByEmail(int id) {
        return service.findById(id);
    }
    @PutMapping
    public Employee update(Employee employee)

    {
        return service.update(employee);
    }
    @DeleteMapping
    public void delete(int Id)
    {
        service.delete(Id);
    }
}
