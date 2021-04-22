package com.myproject.mysmartcity.controller;

import com.myproject.mysmartcity.model.*;
import com.myproject.mysmartcity.service.AboutPageService;
import com.myproject.mysmartcity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List getAllNews() {
        return this.userService.getAll();
    }

    @PostMapping
    public Map save(@RequestBody User user) {
        User user1 =  this.userService.save(user);
        Map map = new HashMap();
        if(user.getAdminId() == null) {
            map.put("role", "admin");
        } else if(user.getCitizenId() != null) {
            map.put("role", "citizen");
        } else if(user.getTouristId() != null){
            map.put("role", "tourist");
        }
        map.put("name", user.getName());
        return map;
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return this.userService.update(user);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.userService.delete(id);
    }

    @PostMapping("/login")
    public Map login(@RequestBody UserLogin userLogin) throws Exception {
        User user =  this.userService.login(userLogin);
        Map map = new HashMap();
        if(user.getAdminId() != null) {
            map.put("role", "admin");
        } else if(user.getCitizenId() != null) {
            map.put("role", "citizen");
        } else if(user.getTouristId() != null){
            map.put("role", "tourist");
        }
        map.put("name", user.getName());
        return map;
    }
}
