package cg.thuc_hanh_5.service.impl;

import cg.thuc_hanh_5.entity.Customer;
import cg.thuc_hanh_5.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customers;
    public CustomerServiceImpl(){
    customers = new ArrayList<>();
        customers.add(new Customer(1,"Nguyen Khac Nhat","nhat@codegym.vn","Hà Nội"));
        customers.add(new Customer(2,"Dang Huy Hoa","hoa.dang@codegym.vn","Đà Nẵng"));
        customers.add(new Customer(3,"Le Thi Chau","chau.le@codegym.vn","Hà Nội"));
        customers.add(new Customer(4,"Nguyen Thuy Duong","duong.nguyen@codegym.vn","Sài Gòn"));
        customers.add(new Customer(5,"CodeGym","codegym@codegym.vn","Việt Nam"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer c: customers
        ) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == customer.getId()){
                customers.set(i,customer);
                break;
            }
        }
    }
}
