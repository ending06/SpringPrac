package com.techmanual.chapterfive.dao.impl;

import com.techmanual.chapterfive.entity.User;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// -------------------------------------------------------

public class UserDaoRdbmsQueryImpl extends MappingSqlQuery {

    public UserDaoRdbmsQueryImpl(DataSource dataSource) {
        super(dataSource, "SELECT * FROM tbl_user where id = ?");
        int[] types = { Types.INTEGER};
        setTypes(types);
        compile();
    }

    @Override
    protected Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setId(new Integer(resultSet.getInt("id")));
        user.setName(new String(resultSet.getString("name")));
        user.setAge(new Integer(resultSet.getInt("age")));
        return user;
    }

}
