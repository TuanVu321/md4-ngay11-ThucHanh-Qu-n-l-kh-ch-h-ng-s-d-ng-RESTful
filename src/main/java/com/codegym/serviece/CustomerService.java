package com.codegym.serviece;

import com.codegym.model.Customer;
import com.codegym.repository.Repository;

import java.util.List;

public interface CustomerService{
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
