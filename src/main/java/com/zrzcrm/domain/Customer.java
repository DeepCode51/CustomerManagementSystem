package com.zrzcrm.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int cid;
    private String cname;
    private String csex;
    private String ctel;
    private String cjob;
    private String ccompany;

}
