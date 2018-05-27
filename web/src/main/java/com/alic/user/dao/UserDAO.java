package com.alic.user.dao;

import com.alic.user.bean.UserBean;
import org.springframework.stereotype.Repository;

/**
 * 用户DAO
 *
 * @author suxingzhe
 * @create 2018-05-14
 **/
@Repository
public interface UserDAO {
    UserBean getUser();
}
