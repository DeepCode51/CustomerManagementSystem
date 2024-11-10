package com.zrzcrm.mapper;

import com.zrzcrm.domain.Emp;

/**
 * @author Richard
 */

public interface EmpMapper {
    /**
     * 注册 （添加员工）
     */
    int addEmp(Emp emp);

    /**
     * 登录（通过用户名查找员工）
     */
    Emp findEmpByUsername(String username);
    /**
     * 欢迎页面（通过Eid找员工）
     */
    Emp findEmpByEid(int eid);
    /**
     * 修改密码
     */
    int updatePasswd(Emp emp);
}
