package com.zrzcrm.controller;

import com.zrzcrm.domain.Emp;
import com.zrzcrm.service.EmpService;
import com.zrzcrm.util.MD5Util;
import com.zrzcrm.util.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：
 * Description：
 *
 * @author：坏人曹怼怼
 * @date：2022/6/14 10:50
 */
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 注册
     */
    @RequestMapping("/crm/reg")
    public ResponseEntity<Integer> reg(Emp emp){
        emp.setPasswd(MD5Util.toMd5(emp.getPasswd()));
        int i = empService.addEmp(emp);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        if (i == -1){
            responseEntity.setCode(200);
            responseEntity.setMessage("用户名已存在！");
            responseEntity.setData(i);
            return responseEntity;
        }
        if (i == -2){
            responseEntity.setCode(500);
            responseEntity.setMessage("添加失败！");
            responseEntity.setData(i);
            return responseEntity;
        }
        responseEntity.setCode(200);
        responseEntity.setMessage("添加成功！");
        responseEntity.setData(i);
        return responseEntity;
    }
    /**
     * 注册
     */
    @RequestMapping("/crm/login")
    public ResponseEntity<Integer> login(Emp emp){
        emp.setPasswd(MD5Util.toMd5(emp.getPasswd()));
        int i = empService.login(emp);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        if (i == -1){
            responseEntity.setCode(200);
            responseEntity.setMessage("用户密码输入错误！");
            responseEntity.setData(i);
            return responseEntity;
        }
        if (i == -2){
            responseEntity.setCode(500);
            responseEntity.setMessage("没有此用户！");
            responseEntity.setData(i);
            return responseEntity;
        }
        responseEntity.setCode(200);
        responseEntity.setMessage("登录成功！");
        responseEntity.setData(i);
        return responseEntity;
    }

    @RequestMapping("/crm/findEmpByEid")
    public ResponseEntity<Emp> findEmpByEid(Emp emp){
        Emp emp1 = empService.findEmpByEid(emp);
        ResponseEntity<Emp> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(emp1);
        return responseEntity;
    }

    @RequestMapping("/crm/updatepasswd")
    public ResponseEntity<Integer> updatePasswd(Emp emp,String newpasswd){
        emp.setPasswd(MD5Util.toMd5(emp.getPasswd()));
        int i = empService.updatePasswd(emp, newpasswd);
        ResponseEntity<Integer> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMessage("OK");
        responseEntity.setData(i);
        return responseEntity;
    }
}

