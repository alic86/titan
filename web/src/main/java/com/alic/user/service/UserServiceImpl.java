package com.alic.user.service;

import com.alic.user.bean.UserBean;
import com.alic.user.dao.UserDAO;
import com.alic.user.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author suxingzhe
 * @create 2018-05-14
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO getUser() {
        UserBean user = userDAO.getUser();
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }
}
