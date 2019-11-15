package com.packages.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybtisUtils {

    public static SqlSession getSqlSession() throws IOException {
        /**读sqlMapConfig
         getResourceAsStream： path  不以’/'开头时默认是从此类所在的包下取资源，
         以’/'开头则是从ClassPath根下获取。其只是通过path构造一个绝对路径，
         最终还是由ClassLoader获取资源。*/
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        /**
         * 创建sqlsession工厂
         */
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        /**
         * 获取sqlsession
         */
        SqlSession sqlSession = build.openSession();
        return sqlSession;
    }
}
