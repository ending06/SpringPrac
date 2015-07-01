package com.techmanual.chapterfive.main;

import com.techmanual.chapterfive.dao.UserDao;
import com.techmanual.chapterfive.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
//-------------------------------------------------------

public class SpringDemo {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/techmanual-spring/spring-chapterfive-dao.xml");

        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        User user = new User("testNmae",10);
        try {
            userDao.insert(user);
        } catch (Exception e) {
            System.out.println("insert result exception:"+e);
        }

        try {
            User queryUser = userDao.find(1);
            System.out.println("find result ="+queryUser);
        } catch (Exception e) {
            System.out.println("find result exception:" + e);
        }

    }
}
