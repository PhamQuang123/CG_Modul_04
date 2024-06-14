package cg.thuc_hanh_5.controller;

import cg.thuc_hanh_5.entity.Customer;
import cg.thuc_hanh_5.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class HomeController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public ModelAndView showListCustomer(){
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("customers", customerService.findAll());
        return mav;
    }

    @GetMapping("/{id}")
    public String showInfor(@PathVariable int id, ModelMap map){
        map.addAttribute("customer",customerService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String doUpdate(Customer customer){
        customerService.save(customer);
        return "redirect:/customers";
    }
}
