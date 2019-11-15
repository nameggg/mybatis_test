package com.packages.mybatis.test;

import com.packages.common.MybtisUtils;
import com.packages.dao.UserDao;
import com.packages.dao.daoImp.UserDaoImp;
import com.packages.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

public class MybatisTest {
    @Test
    public void test1() throws Exception {
        SqlSession sqlSession = MybtisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.allByUser();
        /*UserDao userDao = new UserDaoImp();
        List<User> users = userDao.allByUser();*/
        for (User user:users) {
            System.out.println("user:"+user);
        }
    }
}
