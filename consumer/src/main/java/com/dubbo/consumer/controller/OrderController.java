package com.dubbo.consumer.controller;

import com.dubbo.service.service.OrderService;
import com.dubbo.service.vo.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/dubbo")
    public List<UserAddress> initOder(@RequestParam("uid") String userId) {
        System.out.println(userId);
        return orderService.initOrder(userId);
    }
}
