package com.example.furama.model.services;

import com.example.furama.model.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private Integer area;
    private Double cost;
    private Integer maxPeople;
    @ManyToOne(targetEntity = RentalType.class)
    private RentalType rentalType;
    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceType;
    private String standard;
    private String description;
    private Integer poolArea;
    private Integer floor;
    @OneToMany(mappedBy = "services")
    List<Contract> contractList;

    public Services() {
    }

    public Services(String id, String name, Integer area, Double cost, Integer maxPeople, RentalType rentalType,
                    ServiceType serviceType, String standard, String description, Integer poolArea,
                    Integer floor) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
        this.serviceType = serviceType;
        this.standard = standard;
        this.description = description;
        this.poolArea = poolArea;
        this.floor = floor;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Integer poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}











