package cg.thuc_hanh2.controller;

import cg.thuc_hanh2.model.Customer;
import cg.thuc_hanh2.service.CustomerService;
import cg.thuc_hanh2.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    private CustomerService customerService;
    public CustomerController(){
        customerService = new CustomerServiceImpl();
    }
    @GetMapping("/customer")
    public String showList(Model model){

        model.addAttribute("customers", customerService.findALl());
        return "customer/list";
    }
    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "customer/update";
    }
}
