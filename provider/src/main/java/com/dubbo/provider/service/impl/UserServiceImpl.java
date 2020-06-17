package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.service.UserService;
import com.dubbo.service.vo.UserAddress;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....");
        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "深圳市龙岗区", "1", "shawn", "888888", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区", "1", "jack", "999999", "N");
        return Arrays.asList(address1,address2);
    }
}
