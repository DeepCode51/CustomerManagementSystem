package com.zrzcrm.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：
 * Description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity<T>{
    //响应码  200  404
    private int code;
    //响应信息  OK
    private String message;
    //响应数据
    private T data;
}
