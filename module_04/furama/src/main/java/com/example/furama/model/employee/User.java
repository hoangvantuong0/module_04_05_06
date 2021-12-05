package com.example.furama.model.employee;

import com.example.furama.model.employee.Employee;
import com.example.furama.model.employee.Role;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private String name;
    private String password;
    @OneToMany(targetEntity = Employee.class, mappedBy = "user")
    private List<Employee> employeeList;
    // Khử đệ quy (có nhiều cách)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_name"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roleList;

    public User() {
    }

    public User(String name, String password, List<Employee> employeeList, List<Role> roleList) {
        this.name = name;
        this.password = password;
        this.employeeList = employeeList;
        this.roleList = roleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}










