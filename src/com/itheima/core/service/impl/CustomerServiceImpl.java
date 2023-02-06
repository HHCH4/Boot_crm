package com.itheima.core.service.impl;

import com.itheima.common.utils.Page;
import com.itheima.core.dao.CustomerDao;
import com.itheima.core.po.Customer;
import com.itheima.core.service.CustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel) {
        Customer customer = new Customer();
        if (StringUtils.isNotBlank(custName)) {
            customer.setCust_name(custName);
        }
        if (StringUtils.isNotBlank(custSource)) {
            customer.setCust_source(custSource);
        }
        if (StringUtils.isNotBlank(custIndustry)) {
            customer.setCust_industry(custIndustry);
        }
        if (StringUtils.isNotBlank(custLevel)) {
            customer.setCust_level(custLevel);
        }
        customer.setStart((page - 1) * rows);
        customer.setRows(rows);
        List<Customer> customers =
                customerDao.selectCustomerList(customer);
        Integer count = customerDao.selectCustomerListCount(customer);
        Page<Customer> result = new Page<>();
        result.setRows(customers);
        result.setPage(page);
        result.setSize(rows);
        result.setTotal(count);
        return result;
    }

}

