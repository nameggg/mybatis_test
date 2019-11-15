package com.packages.dao;

import com.packages.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> allByUser() throws SQLException, IOException, Exception;
}
