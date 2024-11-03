package com.educandoweb.Course.Repositories;

import com.educandoweb.Course.Entities.Order;
import com.educandoweb.Course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositories extends JpaRepository<Order,Long> {
}
