package com.service.customer;


import com.model.Customer;
import com.model.Province;
import com.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}