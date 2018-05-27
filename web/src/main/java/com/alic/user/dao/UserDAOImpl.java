package com.alic.user.dao;

import com.alic.user.bean.UserBean;
import org.springframework.stereotype.Repository;

/**
 * @author suxingzhe
 * @create 2018-05-15
 **/
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public UserBean getUser() {
        UserBean user = new UserBean();
        user.setId(1);
        user.setName("alic86");
        user.setPassWord("45UI(&^");
        return user;
    }
}
