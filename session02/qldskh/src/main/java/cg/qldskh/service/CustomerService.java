package cg.qldskh.service;

import cg.qldskh.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();
   Customer findById(int id);
   void save(Customer customer);
}
