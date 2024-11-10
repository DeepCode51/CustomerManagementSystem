package com.zrzcrm.controller;

import com.github.pagehelper.PageInfo;
import com.zrzcrm.domain.Customer;
import com.zrzcrm.service.CustomerService;
import com.zrzcrm.util.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
//restful风格：四种请求方式：get 查询  post  添加   put 修改  delete  删除
    /**
     * 添加客户
     * @param customer
     * @return
     */
    @RequestMapping(value = "/cus",method = RequestMethod.POST)
    public ResponseEntity<Integer> addCustomer(Customer customer){
        int i = customerService.addCustomer(customer);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(i);
        return responseEntity;
    }

    /**
     * 删除客户
     * @param cid
     * @return
     */
    @RequestMapping(value = "/cus/{cid}",method = RequestMethod.DELETE)
    public ResponseEntity<Integer> deleteCustomer(@PathVariable(value = "cid") int cid){
        int i = customerService.deleteCustomer(cid);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(i);
        return responseEntity;
    }

    /**
     * 查询单个客户
     */
    @RequestMapping(value = "/cus/{cid}",method = RequestMethod.GET)
    public ResponseEntity<Customer> findOneCustomerByCid(@PathVariable(value = "cid") int cid){
        Customer customer = customerService.findOneCustomer(cid);
        ResponseEntity<Customer> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(customer);
        return responseEntity;
    }

    @RequestMapping(value = "/cus/findall",method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> findOneCustomerByCid(){
        List<Customer> allCustomer2 = customerService.findAllCustomer2();
        ResponseEntity<List<Customer>> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(allCustomer2);
        return responseEntity;
    }

    /**
     * 修改客户
     */
    @RequestMapping(value = "/cus",method = RequestMethod.PUT)
    public ResponseEntity<Integer> updateCustomer(Customer customer){
        int i = customerService.updateCustomer(customer);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(i);
        return responseEntity;
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/cus",method = RequestMethod.GET)
    public ResponseEntity<PageInfo<Customer>> findAllCustomer(int pageNum,int pageSize){
        PageInfo<Customer> allCustomer = customerService.findAllCustomer(pageNum, pageSize);
        ResponseEntity<PageInfo<Customer>> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(allCustomer);
        return responseEntity;
    }

}

