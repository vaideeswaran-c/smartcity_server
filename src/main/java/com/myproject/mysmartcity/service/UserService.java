package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.User;
import com.myproject.mysmartcity.model.UserLogin;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User save(User user);

    User update(User user);

    void delete(Long id);

    User login(UserLogin userLogin) throws Exception;

}
