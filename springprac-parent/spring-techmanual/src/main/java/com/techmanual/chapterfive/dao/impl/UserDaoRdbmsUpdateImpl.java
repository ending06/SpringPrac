package com.techmanual.chapterfive.dao.impl;

import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// -------------------------------------------------------

public class UserDaoRdbmsUpdateImpl extends SqlUpdate {

    public UserDaoRdbmsUpdateImpl(DataSource dataSource) {
        super(dataSource, "INSERT INTO tbl_user (name,age) VALUES(?,?)");
        int[] types = { Types.VARCHAR, Types.INTEGER };
        setTypes(types);
        compile();
    }
}
