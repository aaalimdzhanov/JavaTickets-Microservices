package com.beelab.intranet.controllers;

import com.beelab.intranet.models.UserModel;
import com.beelab.intranet.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getAllUsers")
    public List<UserModel> getAllTickets(){

        List<UserModel> userModelList = userRepository.findAll();
        System.out.println(userModelList);
        return userModelList;

    }
}
