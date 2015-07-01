package com.techmanual.chapterfive.dao.impl;

import com.google.common.base.Preconditions;
import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// spring编程式事务管理
// -------------------------------------------------------

public class UserDaoProgramTransactionImpl implements UserDao {
    private DataSourceTransactionManager dataSourceTransactionManager;
    private DefaultTransactionDefinition defaultTransactionDefinition;
    private JdbcTemplate jdbcTemplate;

    public UserDaoProgramTransactionImpl(DataSource dataSource) {
        dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
        defaultTransactionDefinition = new DefaultTransactionDefinition();
        defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
    }

    @Override
    public Integer insert(User user) throws Exception {
        Preconditions.checkNotNull(user, "user param is invalid!");
        String name = user.getName();
        int age = user.getAge().intValue();
        TransactionStatus status = dataSourceTransactionManager.getTransaction(defaultTransactionDefinition);

        int insertReslt = jdbcTemplate.update("INSERT INTO tbl_user (name,age) VALUES ('" + name + "'," + age + ")");

        int insertReslt2 = jdbcTemplate.update("INSERT INTO tbl_user (name,age) VALUES ('" + name + "')");

        // 事务提交，保证只有两条sql均执行正确，才会向数据库插入两条sql，如果发生异常，则回滚
        dataSourceTransactionManager.commit(status);
        return insertReslt;
    }

    @Override
    public User find(Integer id) throws Exception {
        return null;
    }
}
