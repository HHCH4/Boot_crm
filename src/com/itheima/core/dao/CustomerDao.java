package com.itheima.core.dao;

import com.itheima.core.po.Customer;

import java.util.List;

public interface CustomerDao {
    //客户列表
    public List<Customer> selectCustomerList(Customer customer);

    //客户数
    public Integer selectCustomerListCount(Customer customer);


}
