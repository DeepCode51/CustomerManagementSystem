package com.zrzcrm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataConTest {
    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("加载驱动程序有错误！请查看MySql的jar包导入是否正确");
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/mybatis?user=root&password=zhangruizhe0217&useUnicode=true&characterEncoding=utf8";
        try {
            connection= DriverManager.getConnection(url);
            System.out.println("MySQL数据库连接成功！");
        } catch (SQLException e) {
            System.out.println("数据库连接失败，请检查用户名、密码、端口号等是否正确！");
            e.printStackTrace();
        }
        return connection;

    }
    public static void main(String[] args) {
        getConnection();
    }
}
