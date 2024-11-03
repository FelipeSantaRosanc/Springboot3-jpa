package com.educandoweb.Course.Services;

import com.educandoweb.Course.Entities.Order;
import com.educandoweb.Course.Entities.User;
import com.educandoweb.Course.Repositories.OrderRepositories;
import com.educandoweb.Course.Repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositories orderRepositories;

    public List<Order> findAll(){
        return orderRepositories.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepositories.findById(id);
        return obj.get();

    }

}
