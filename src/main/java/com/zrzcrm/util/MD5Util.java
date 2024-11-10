package com.zrzcrm.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ClassName：
 * Description：
 *
 * @author：坏人曹怼怼
 * @date：2021/9/6 22:29
 */
public class MD5Util {
    public static   String  toMd5(String  oldPasswd){
        MessageDigest md5 = null;
        //加密之后的密文
        String result ="";
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] newPasswd = md5.digest(oldPasswd.getBytes());
            //System.out.println(newPasswd.length);

            for(byte b : newPasswd) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return   result;
    }

    public static void main(String[] args) {
        String s = "123456";
        String s1 = MD5Util.toMd5(s);
        System.out.println(s1);
    }
}
