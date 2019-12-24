package com.j1.service.impl;

import java.util.List;
import com.j1.bean.UserAddress;
import com.j1.service.OrderService;
import com.j1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl  implements OrderService{
	@Autowired
	UserService userService;
	public List<UserAddress> initOrder(String userId) {
				System.out.println("用户id："+userId);
				//1、查询用户的收货地址
				List<UserAddress> addressList = userService.getUserAddressList(userId);
				for (UserAddress userAddress : addressList) {
					System.out.println(userAddress.getUserAddress());
				}
				return addressList;
	}

}
