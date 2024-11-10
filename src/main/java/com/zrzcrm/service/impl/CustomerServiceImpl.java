package com.zrzcrm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zrzcrm.domain.Customer;
import com.zrzcrm.mapper.CustomerMapper;
import com.zrzcrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl  implements CustomerService {
    @Autowired
    public CustomerMapper customerMapper;
    /**
     * 添加用户
     * @param customer
     * @return
     */
    @Override
    public int addCustomer(Customer customer) {
        int i = customerMapper.addCustomer(customer);
        return i;
    }

    /**
     * 删除用户
     * @param cid
     * @return
     */
    @Override
    public int deleteCustomer(int cid) {
        int i = customerMapper.deleteCustomer(cid);
        return i;
    }

    /**
     * 修改用户
     * @param customer
     * @return
     */
    @Override
    public int updateCustomer(Customer customer) {
        int i = customerMapper.updateCustomer(customer);
        return i;
    }


    @Override
    public PageInfo<Customer> findAllCustomer(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Customer> allCustomer = customerMapper.findAllCustomer();
        PageInfo<Customer> pageInfo = new PageInfo<>(allCustomer);
        return pageInfo;
    }

    /**
     * 通过Cid查找单个用户
     * @param cid
     * @return
     */
    @Override
    public Customer findOneCustomer(int cid) {
        Customer customer = customerMapper.findOneCustomer(cid);
        return customer;
    }

    @Override
    public List<Customer> findAllCustomer2() {
        List<Customer> allCustomer = customerMapper.findAllCustomer();
        return allCustomer;
    }
}
