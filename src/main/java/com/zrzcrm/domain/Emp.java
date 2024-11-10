package com.zrzcrm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private int eid;
    private String ename;
    private String esex;
    private String etel;
    private String etx;
    private String username;
    private String passwd;


}
