package com.example.sadi_A2.controller;

import com.example.sadi_A2.model.Customer;
import com.example.sadi_A2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(path = "/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(path = "/customers", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(path = "/customers", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @RequestMapping(path = "/customers", method = RequestMethod.DELETE)
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }
}
