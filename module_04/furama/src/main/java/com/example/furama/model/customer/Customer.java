package com.example.furama.model.customer;

import com.example.furama.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Table
@Entity
public class Customer {
    @Id
    @Pattern(regexp = "KH-[0-9]{4}", message = "Wrong format! Please input again!")
    private String id;
    @ManyToOne(targetEntity = CustomerType.class)
    @NotNull(message = "Please choose one")
    private CustomerType customerType;
    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "Wrong format! Please capitalize the first letter")
    private String name;
    @Column(name = "birthday", columnDefinition = "VARCHAR(45)")
    @NotEmpty(message = "Birthday should not empty!")
    private String birthday;
    @Column(name = "gender", columnDefinition = "VARCHAR(15)")
    @NotNull(message = "Please select a gender")
    private Boolean gender;
    @Column(name = "idCard", columnDefinition = "VARCHAR(15)")
    @Pattern(regexp = "[0-9]{9}|[09]{12}", message = "Wrong format! please input like the pattern!")
    private String idCard;
    @Column(name = "phone", columnDefinition = "VARCHAR(15)")
    @Pattern(regexp = "^(09|\\(84\\)+9)[01]\\d{7}$", message = "Wrong format! please input like the pattern!")
    private String phone;
    @Column(name = "email", columnDefinition = "VARCHAR(100)")
    @Pattern(regexp = "^[a-zA-Z0-9]+@[a-z]+.[a-z]+$", message = "Wrong format! please input like the pattern!")
    private String email;
    @Column(name = "address", columnDefinition = "VARCHAR(100)")
    @NotBlank(message = "Please input address name")
    private String address;

    @OneToMany(targetEntity = Contract.class, mappedBy = "customer")
    List<Contract> contractList;

    public Customer() {
    }

    public Customer(String id, CustomerType customerType, String name, String birthday, Boolean gender,
                    String idCard, String phone, String email, String address, List<Contract> contractList) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.contractList = contractList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}















