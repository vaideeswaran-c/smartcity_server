package com.myproject.mysmartcity.service;

import com.myproject.mysmartcity.model.AboutPage;
import com.myproject.mysmartcity.model.User;
import com.myproject.mysmartcity.model.UserLogin;
import com.myproject.mysmartcity.repository.AboutPageRepository;
import com.myproject.mysmartcity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> userList = (List<User>) userRepository.findAll();
        return userList;
    }

    public User save(User user) {
        user = userRepository.save(user);
        return user;
    }

    public User update(User user) {
        user = userRepository.save(user);
        return user;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User login(UserLogin userLogin) throws Exception {
        try {
            Optional<User> userOptional = this.userRepository.findByEmailAndPassword(userLogin.getEmail(), userLogin.getPassword());
            if(userOptional.isPresent()) {
                User user = userOptional.get();
                return user;
            }
        } catch (Exception e) {
            throw new Exception("Invalid credentials");
        }
        return new User();
    }
}
