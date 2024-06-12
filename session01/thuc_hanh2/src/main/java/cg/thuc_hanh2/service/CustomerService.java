package cg.thuc_hanh2.service;

import cg.thuc_hanh2.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findALl();
    Customer findById(int id);
}
