package com.techmanual.chapterfive.main;

import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// -------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfive-dao.xml");
/*        // commonSql
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User("testNmae", 10);
        try {
            userDao.insert(user);
        } catch (Exception e) {
            System.out.println("insert result exception:" + e);
        }

        try {
            User queryUser = userDao.find(1);
            System.out.println("find result =" + queryUser);
        } catch (Exception e) {
            System.out.println("find result exception:" + e);
        }

        // jdbcTemplate
        UserDao userDao1 = (UserDao) applicationContext.getBean("jdbcTemplateUserDao");
        User user1 = new User("testNmaeJdbcTemplate", 10);
        try {
            userDao1.insert(user1);
        } catch (Exception e) {
            System.out.println("insert result exception:" + e);
        }

        try {
            User queryUser = userDao1.find(1);
            System.out.println("find result =" + queryUser);
        } catch (Exception e) {
            System.out.println("find result exception:" + e);
        }

        // jdbc rdbms
        UserDao userDao2 = (UserDao) applicationContext.getBean("rdbmsObjectUserDao");
        User user2 = new User("rdbmsUserInfo", 11);
        try {
            userDao2.insert(user2);
        } catch (Exception e) {
            System.out.println("insert result exception:" + e);
        }

        try {
            User queryUser = userDao2.find(5);
            System.out.println("find result =" + queryUser);
        } catch (Exception e) {
            System.out.println("find result exception:" + e);
        }*/

        //programTraction
        UserDao userDao3 = (UserDao) applicationContext.getBean("programTransactionUserDao");
        User user3 = new User("programTractionUserIndo", 12);
        try {
            userDao3.insert(user3);
        } catch (Exception e) {
            System.out.println("insert result exception:" + e);
        }
    }
}
