package com.packages.dao.daoImp;

import com.packages.common.MybtisUtils;
import com.packages.dao.UserDao;
import com.packages.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImp implements UserDao {
    @Override
    public List<User> allByUser() throws Exception {
        List<User> result=null;
        SqlSession sqlSession = MybtisUtils.getSqlSession();
        result = sqlSession.selectList("com.packages.dao.UserDao.allByUser");

        return result;
    }
}
