package com.educandoweb.Course.Services;

import com.educandoweb.Course.Entities.User;
import com.educandoweb.Course.Repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories userRepositories;

    public List<User> findAll(){
        return userRepositories.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepositories.findById(id);
        return obj.get();

    }

}
