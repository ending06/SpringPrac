package com.techmanual.chapterfive.dao;

import com.techmanual.chapterfive.entity.User;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/30<p>
// -------------------------------------------------------

public interface UserDao {

    public Integer insert(User user) throws Exception;

    public User find(Integer id) throws Exception;
}
