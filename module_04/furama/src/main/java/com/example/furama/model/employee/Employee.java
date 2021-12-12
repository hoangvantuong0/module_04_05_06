package com.example.furama.model.employee;

import com.example.furama.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "Wrong format! Please capitalize the first letter")
    private String name;
    @Column(name = "birthday", columnDefinition = "VARCHAR(45)")
    @NotEmpty(message = "Birthday should not empty!")
    private String birthday;
    @Column(name = "idCard", columnDefinition = "VARCHAR(15)", unique=true)
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}", message = "Wrong format! please input like the pattern!")
    @NotBlank(message = "please input!")
    private String idCard;
    @NotNull(message = "input salary!")
    @Column(columnDefinition = "salary")
    private Double salary;
    @NotBlank(message = "input please")
    @Column(columnDefinition = "VARCHAR(45)",unique=true)
    @Pattern(regexp = "090\\d{7}||091\\d{7}||[(]84[)][+]90\\d{7}||[(]84[)][+]91\\d{7}",
            message = "Wrong format! please input like the pattern!")
    private String phone;
    @NotBlank(message = "input please!")
    @Column(columnDefinition = "VARCHAR(45)",unique=true)
    @Pattern(regexp = "[^\\s@]+@[^\\s@]+\\.[^\\s@]+",message = "Wrong format! please input like the pattern!")
    private String email;
    @Column(name = "address", columnDefinition = "VARCHAR(100)")
    @NotBlank(message = "Please input address name")
    private String address;


    @ManyToOne(targetEntity = Position.class)
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = Division.class)
    private Division division;
    @ManyToOne(targetEntity = User.class)
    private User user;

    @OneToMany(mappedBy = "employee")
    List<Contract> contractList;

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String idCard, Double salary, String phone,
                    String email, String address, Position position, EducationDegree educationDegree,
                    Division division, User user) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}



















