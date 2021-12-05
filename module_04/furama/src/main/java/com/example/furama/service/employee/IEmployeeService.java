package com.example.furama.service.employee;

import com.example.furama.model.employee.Employee;
import com.example.furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IGeneralService<Employee> {
    Page<Employee> findAll(Pageable pageable);
}
