package com.zrzcrm.mapper;


import com.zrzcrm.domain.Customer;

import java.util.List;

/**
 * 客户的Mapper类
 */
public interface CustomerMapper {

    /**
     * 查询所有客户
     */
    List<Customer> findAllCustomer();
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
     * 通过Cid查询单个客户
     */
    Customer findOneCustomer(int cid);

}
