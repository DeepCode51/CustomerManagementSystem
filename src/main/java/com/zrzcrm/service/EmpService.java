package com.zrzcrm.service;


import com.zrzcrm.domain.Emp;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    /**
     * 注册 （添加员工）
     */
    int addEmp(Emp emp);
    /**
     *  登录（通过用户名查找员工）
     */
    int login(Emp emp);
    /**
     * 通过Eid查找Emp
     */
    Emp findEmpByEid(Emp emp);

    /**
     * 修改密码
     * @param emp
     * @param newpasswd
     * @return
     */
    int updatePasswd(Emp emp,String newpasswd);
}
