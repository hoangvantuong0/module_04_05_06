package com.example.furama.model.customer;

import com.example.furama.model.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class Customer {
    @Id
    private String id;
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;
    private String name;
    private String birthday;
    private Boolean gender;
    private String idCard;
    private String phone;
    private String email;
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















