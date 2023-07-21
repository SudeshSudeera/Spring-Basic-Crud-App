package com.app.service;

import com.app.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAllCustomers();
    public void saveCustomer(Customer customer);
    public Customer findCustomer(long id);
    public void deleteCustomer(long id);
}
