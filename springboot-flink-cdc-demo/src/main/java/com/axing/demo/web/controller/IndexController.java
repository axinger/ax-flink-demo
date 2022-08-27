package com.axing.demo.web.controller;

import com.axing.demo.web.domain.Order;
import com.axing.demo.web.domain.User;
import com.axing.demo.web.service.OrderService;
import com.axing.demo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private OrderService orderService;


    @Autowired
    private UserService userService;


    @GetMapping("/add/order")
    public Object addOrder() {

        List<Order> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Order order = new Order();
            order.setNo("no-"+i);
            list.add(order);
        }
        orderService.saveBatch(list);
        return list;
    }


    @GetMapping("/add/user")
    public Object addUser() {

        List<User> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setName("name-"+i);
            user.setAge(i);
            list.add(user);
        }

        userService.saveBatch(list);
        return list;
    }
}
