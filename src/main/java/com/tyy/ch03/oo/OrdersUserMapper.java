package com.tyy.ch03.oo;

import com.tyy.pojo.OrdersCustom;

import java.util.List;

public interface OrdersUserMapper {

    //查询订单信息，关联查询创建订单的用户信息
    public List<OrdersCustom> find();

}
