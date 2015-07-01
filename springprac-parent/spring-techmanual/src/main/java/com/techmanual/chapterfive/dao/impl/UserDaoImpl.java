package com.techmanual.chapterfive.dao.impl;

import com.google.common.base.Preconditions;
import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import com.techmanual.chapterfour.base.LogInfoBase;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// 普通的sql连接处理流程
// -------------------------------------------------------

public class UserDaoImpl extends LogInfoBase implements UserDao {

    private DataSource dataSource;

    @Override
    public Integer insert(User user) throws Exception {
        Preconditions.checkNotNull(user, "user param is invalid!");
        String name = user.getName();
        int age = user.getAge().intValue();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO tbl_user(name,age) VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int result = preparedStatement.executeUpdate();
            return Integer.reverse(result);
        } catch (SQLException e) {
            logger.error("insert user info has SQLException:", e);
            throw new Exception("sql exception");
        } catch (Exception e) {
            logger.error("system error!", e);
            throw new Exception("insert user info failed!");
        } finally {
            closeConnection(preparedStatement, connection);
        }
    }

    @Override
    public User find(Integer id) throws Exception {
        Preconditions.checkNotNull(id, "query user info by id exception,id is invalid");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 获取连接
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM tbl_user WHERE id = ?");
            preparedStatement.setInt(1, id.intValue());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Integer userId = new Integer(resultSet.getInt(1));
                String userName = resultSet.getString(2);
                Integer age = new Integer(resultSet.getInt(3));

                User userResult = new User();
                userResult.setId(userId);
                userResult.setName(userName);
                userResult.setAge(age);

                return userResult;
            }
            return null;
        } catch (SQLException e) {
            logger.error("find user info has SQLException:", e);
            throw new Exception("sql exception");
        } catch (Exception e) {
            logger.error("system error!", e);
            throw new Exception("find user info failed!");
        }

        finally {
            closeConnection(preparedStatement, connection);
        }
    }

    private void closeConnection(PreparedStatement preparedStatement, Connection connection) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // ====================================private get/set methods=====================//
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
