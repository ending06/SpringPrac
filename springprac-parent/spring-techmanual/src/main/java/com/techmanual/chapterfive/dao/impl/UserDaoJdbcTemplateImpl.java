package com.techmanual.chapterfive.dao.impl;

import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import com.techmanual.chapterfour.base.LogInfoBase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// spring jdbc提供的处理流程
// -------------------------------------------------------

public class UserDaoJdbcTemplateImpl extends LogInfoBase implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Integer insert(User user) throws Exception {
        Preconditions.checkNotNull(user, "user param is invalid!");
        String name = user.getName();
        int age = user.getAge().intValue();
        int insertReslt = jdbcTemplate.update("INSERT INTO tbl_user (name,age) VALUES ('" + name + "'," + age + ")");
        return insertReslt;

    }

    @Override
    public User find(Integer id) throws Exception {
        List<Map<String, Object>> queryResult = jdbcTemplate.queryForList("SELECT * FROM tbl_user WHERE id = "
                + id.intValue());
        User user = new User();
        if (queryResult != null && queryResult.size() > 0) {
            Map<String, Object> userResult = queryResult.get(0);
            // Object属性的key值和value值
            for (Map.Entry<String, Object> entry : userResult.entrySet()) {

                if ("name".equalsIgnoreCase(entry.getKey())) {
                    user.setName((String) entry.getValue());
                }
                if ("age".equalsIgnoreCase(entry.getKey())) {
                    user.setAge((Integer) entry.getValue());
                }
            }

        }
        return user;
    }
}
