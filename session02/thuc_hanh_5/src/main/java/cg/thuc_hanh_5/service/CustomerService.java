package cg.thuc_hanh_5.service;

import cg.thuc_hanh_5.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
   Customer findById(int id);
   void save(Customer customer);
}
