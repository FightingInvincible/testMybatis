package com.tyy.ch03.mm;

import com.tyy.pojo.UserCustom;

import java.util.List;

public interface UserItemsMapper {

    //查询用户及用户购买商品信息
    public List<UserCustom> find();

}
