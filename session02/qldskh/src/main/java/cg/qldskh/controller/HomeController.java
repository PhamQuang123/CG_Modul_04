package cg.qldskh.controller;

import cg.qldskh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private CustomerService customerService;
   @GetMapping()
    public ModelAndView home(){
       ModelAndView mav = new ModelAndView("list");
       mav.addObject("customers", customerService.findAll());
       return mav;
   }
}
