package com.example.sadi_A2.controller;

import com.example.sadi_A2.model.Order;
import com.example.sadi_A2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(path = "/orders", method = RequestMethod.GET)
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping(path = "/orders", method = RequestMethod.POST)
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

    @RequestMapping(path = "/orders", method = RequestMethod.PUT)
    public void updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
    }

    @RequestMapping(path = "/orders", method = RequestMethod.DELETE)
    public void deleteOrder(@RequestBody Order order){
        orderService.deleteOrder(order);
    }
}
