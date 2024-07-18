package com.campuslands.springdemo.user.infrastructure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.campuslands.springdemo.user.application.CustomerService;
import com.campuslands.springdemo.user.domain.Customer;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getAllCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customer/customer";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable Integer id, Model model) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer.orElse(null));
        return "customer/customer-details";
    }

    @GetMapping("/new")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/customer-form";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/edit/{id}")
    public String updateCustomerForm(@PathVariable Integer id, Model model) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer.orElse(null));
        return "customer/customer-form";
    }

    @PostMapping("/{id}")
    public String updateCustomer(@PathVariable Integer id, @ModelAttribute Customer customer) {
        customer.setCustomerId(id);
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
}