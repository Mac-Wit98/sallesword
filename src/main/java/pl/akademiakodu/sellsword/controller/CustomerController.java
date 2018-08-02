package pl.akademiakodu.sellsword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.sellsword.dao.CustomerDao;
import pl.akademiakodu.sellsword.model.Customer;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/customer/form")
    public String addCustomer(ModelMap modelMap) {
        modelMap.addAttribute( "customer", new Customer());
        return "customer/add";
    }
    @PostMapping("/customer/add")
    public String createCustomer(@ModelAttribute Customer customer){
        customerDao.save(customer);
        return "redirect:/customer/all";
    }
    @GetMapping("/customer/all")
    public String allCustomer(ModelMap modelMap){
        modelMap.addAttribute("customers", customerDao.findAll() );
        return "customer/all";
    }

}
