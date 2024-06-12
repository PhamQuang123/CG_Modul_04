package cg.baitap1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @GetMapping("/home")
    public String convert() {

        return "home";
    }

    @PostMapping("/convert")
    public String doConvert(@RequestParam double usd, Model model) {
        double result = usd * 23000;
        model.addAttribute("result", result);
        model.addAttribute("usd",usd);
        return "home";
    }
}
