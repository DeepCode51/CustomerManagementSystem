package com.zrzcrm.service.impl;

import com.zrzcrm.domain.Emp;
import com.zrzcrm.mapper.EmpMapper;
import com.zrzcrm.service.EmpService;
import com.zrzcrm.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName：
 * Description：
 *
 * @date：2022/6/14 10:04
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    /**
     * 注册
     * @param emp
     * @return
     */
    @Override
    public int addEmp(Emp emp) {
        try {
            Emp empByUsername = empMapper.findEmpByUsername(emp.getUsername());
            if (empByUsername == null){
                //注册
                int i = empMapper.addEmp(emp);
                return i;
            }else {
                //用户名已被占用
                return -1;
            }
        }catch (Exception e){
            //注册失败
            return -2;
        }
    }

    /**
     * 登录
     * @param emp
     * @return
     */
    @Override
    public int login(Emp emp) {
        try {
            Emp emp1 = empMapper.findEmpByUsername(emp.getUsername());
            if (emp1.getPasswd().equals(emp.getPasswd())){
                //密码正确
                return emp1.getEid();
            }
            //用户密码输入错误
            return -1;
        }catch (Exception e){
            //没有此用户
            return -2;
        }
    }

    @Override
    public Emp findEmpByEid(Emp emp) {
        Emp empByEid = empMapper.findEmpByEid(emp.getEid());
        empByEid.setPasswd("");
        return empByEid;
    }
    /**
     * 修改密码
     */
    @Override
    public int updatePasswd(Emp emp, String newpasswd) {
        Emp empByEid = empMapper.findEmpByEid(emp.getEid());
        //验证旧密码是否正确
        if (empByEid.getPasswd().equals(emp.getPasswd())){
            emp.setPasswd(MD5Util.toMd5(newpasswd));
            int i = empMapper.updatePasswd(emp);
            return i;
        }
        return -1;
    }
}
