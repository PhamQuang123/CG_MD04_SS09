package cg.codegym.service;

import cg.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws Exception;

    Customer findOne(Long id) throws Exception;
    void save(Customer customer) throws Exception;
}
