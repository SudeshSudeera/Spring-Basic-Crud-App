package com.app.dao;

import com.app.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> findAllCustomers();
    public void saveCustomer(Customer customer);
    public Customer findCustomer(long id);
    public void deleteCustomer(long id);
}
