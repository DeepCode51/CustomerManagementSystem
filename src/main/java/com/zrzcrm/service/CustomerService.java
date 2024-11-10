package com.zrzcrm.service;

import com.github.pagehelper.PageInfo;
import com.zrzcrm.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CustomerService  {

    /**
     * 添加客户
     */
    int addCustomer(Customer customer);

    /**
     * 删除客户
     */
    int deleteCustomer(int cid);

    /**
     * 修改客户
     */
    int updateCustomer(Customer customer);

    /**
     * 查询所有客户
     */
    PageInfo<Customer> findAllCustomer(int pageNum,int pageSize);
    List<Customer> findAllCustomer2();

    /**
     * 通过Cid查询单个客户
     */
    Customer findOneCustomer(int cid);

}
