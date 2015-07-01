package com.techmanual.chapterfive.dao.impl;

import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.util.List;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// JDBC以对象的方式操作，可以保证调用层和sql层次的分离
// -------------------------------------------------------

public class UserDaoRdbmsObjectImpl implements UserDao {
    private SqlUpdate userDaoRdbmsUpdateImpl;
    private MappingSqlQuery userDaoRdbmsQueryImpl;

    @Override
    public Integer insert(User user) throws Exception {
        return userDaoRdbmsUpdateImpl.update(new Object[] { user.getName(), user.getAge() });
    }

    @Override
    public User find(Integer id) throws Exception {
        List<Object> result = userDaoRdbmsQueryImpl.execute(id.intValue());
        if (result != null && result.size() > 0) {
            return (User) result.get(0);
        }
        return new User();
    }

    public UserDaoRdbmsObjectImpl(DataSource dataSource) {
        userDaoRdbmsUpdateImpl = new UserDaoRdbmsUpdateImpl(dataSource);
        userDaoRdbmsQueryImpl = new UserDaoRdbmsQueryImpl(dataSource);
    }
}
