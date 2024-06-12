package cg.thuc_hanh2.service;

import cg.thuc_hanh2.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> findALl() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Nguyen Khac Nhat","nhat@codegym.vn","Hà Nội"));
        customers.add(new Customer(2,"Dang Huy Hoa","hoa.dang@codegym.vn","Đà Nẵng"));
        customers.add(new Customer(3,"Le Thi Chau","chau.le@codegym.vn","Hà Nội"));
        customers.add(new Customer(4,"Nguyen Thuy Duong","duong.nguyen@codegym.vn","Sài Gòn"));
        customers.add(new Customer(5,"CodeGym","codegym@codegym.vn","Việt Nam"));
        return customers;
    }

    @Override
    public Customer findById(int id) {
        List<Customer> customers = findALl();
        for (Customer c: customers
             ) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
